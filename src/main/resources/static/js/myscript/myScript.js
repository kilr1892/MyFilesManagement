function addMoneyLine() {
    prevent_reloading();
    var table = $("#tableAll");
    var a = {};
    var result = JSON.parse('{\"data\":[]}');

    var currentRow = table.find("tr").length - 1;
    var orderDate = table.find('tr').eq(currentRow).find('td:eq(0)').text();

    var orderCustomerName = table.find('tr').eq(currentRow).find('td:eq(1)').text();

    var orderMaterialName = table.find('tr').eq(currentRow).find('td:eq(2)').text();

    // 进项金额
    var paymentInputMoney = table.find('tr').eq(currentRow).find('td:eq(12)').text();
    if (paymentInputMoney == "") {
        paymentInputMoney = 0;
    }
    // 应收账款
    var lastShowEveryReceivables = table.find('tr').eq(currentRow - 1).find('td:eq(13)').text();

    var showEveryReceivables = Number(lastShowEveryReceivables) - Number(paymentInputMoney);
    table.find('tr').eq(currentRow).find('td:eq(13)').text(showEveryReceivables);
    // 收款方式
    var paymentMethod = table.find('tr').eq(currentRow).find('td:eq(14)').text();
    //备注
    var paymentRemarks = table.find('tr').eq(currentRow).find('td:eq(15)').text();
    a.orderDate = orderDate;
    a.orderCustomerName = orderCustomerName;
    a.orderMaterialName = orderMaterialName;
    a.paymentInputMoney = paymentInputMoney;
    a.showEveryReceivables = showEveryReceivables;
    a.paymentMethod = paymentMethod;
    a.paymentRemarks = paymentRemarks;
    result.data.push(a);

    var obj = JSON.stringify(result);
    $.ajax({
        url: "/statistics/addMoneyLine",
        type: "post",
        data: obj,
        // datatype: "json",
        contentType: 'application/json;charset=UTF-8',
        success: function (data) {
            alert("增加进项金额成功");
        }
    });
}

function updateReceivables() {

    prevent_reloading();

    var currentRow;

    // 用于存放json数组
    var result = JSON.parse('{\"data\":[]}');

    // 当前行号
    currentRow = event.srcElement.parentElement.parentElement.rowIndex;
    // currentRow += 1;
    // 所有行数
    var table = $("#tableAll");
    var currentRowLength = table.find('tr').length;


    for (i = currentRow; i < currentRowLength; i++) {
        // td:eq(8)销售金额   td:eq(9)切割工   td:eq(10)税点  td:eq(11)冲帐  td:eq(12)进项金额  td:eq(13)应收款
        var a = new Object();

        a.primaryKeyForOrder = document.getElementById("primaryKeyForOrder" + i).value;

        var orderDate = table.find('tr').eq(i).find('td:eq(0)').text();
        if (orderDate == "") {
            orderDate = "";
        }
        a.orderDate = orderDate;

        var orderCustomerName = table.find('tr').eq(i).find('td:eq(1)').text();
        a.orderCustomerName = orderCustomerName;

        var orderMaterialName = table.find('tr').eq(i).find('td:eq(2)').text();
        a.orderMaterialName = orderMaterialName;

        var orderMaterialColor = table.find('tr').eq(i).find('td:eq(3)').text();
        a.orderMaterialColor = orderMaterialColor;

        var orderId = table.find('tr').eq(i).find('td:eq(4)').text();
        a.orderId = orderId;

        var orderMaterialSpecifications = table.find('tr').eq(i).find('td:eq(5)').text();
        a.orderMaterialSpecifications = orderMaterialSpecifications;

        var orderMaterialWeight = table.find('tr').eq(i).find('td:eq(6)').text();
        if (orderMaterialWeight == "") {
            a.orderMaterialWeight = orderMaterialWeight;
            orderMaterialWeight = 0;
        }

        var orderPrice = table.find('tr').eq(i).find('td:eq(7)').text();
        if (orderPrice == "") {
            a.orderPrice = orderPrice;
            orderPrice = 0;
        }


        // 销售金额
        var orderTotalPrice = Number(orderMaterialWeight) * Number(orderPrice);
        table.find('tr').eq(i).find('td:eq(8)').text(orderTotalPrice);
        if (orderTotalPrice === 0) {
            orderTotalPrice = "";
        }
        a.orderTotalPrice = orderTotalPrice;
        // 切割工
        var orderCuttingWage = table.find('tr').eq(i).find('td:eq(9)').text();
        if (orderCuttingWage == "") {
            a.orderCuttingWage = orderCuttingWage;
            orderCuttingWage = 0;
        }
        // 税点
        var orderTaxPoint = table.find('tr').eq(i).find('td:eq(10)').text();
        if (orderTaxPoint == "") {
            a.orderTaxPoint = orderTaxPoint;
            orderTaxPoint = 0;
        }
        // 冲账
        var orderStrike = table.find('tr').eq(i).find('td:eq(11)').text();
        if (orderStrike == "") {
            a.orderStrike = orderStrike;
            orderStrike = 0;
        }
        // 进项金额
        var paymentInputMoney = table.find('tr').eq(i).find('td:eq(12)').text();
        if (paymentInputMoney == "") {
            paymentInputMoney = 0;
        }
        a.paymentInputMoney = paymentInputMoney;
        // 应收款
        var lastShowEveryReceivables = 0;
        if (i == 1) {
            lastShowEveryReceivables = 0;
        } else {
            lastShowEveryReceivables = table.find('tr').eq(i - 1).find('td:eq(13)').text();
        }
        // 这步的意义是啥...
        a.lastShowEveryReceivables = lastShowEveryReceivables;
        // |- 计算
        var showEveryReceivables = Number(lastShowEveryReceivables) + Number(orderTotalPrice) + Number(orderCuttingWage)
            + Number(orderTaxPoint) + Number(orderStrike) - Number(paymentInputMoney);
        table.find('tr').eq(i).find('td:eq(13)').text(showEveryReceivables);
        a.showEveryReceivables = showEveryReceivables;
        // 收款方式
        var paymentMethod = table.find('tr').eq(i).find('td:eq(14)').text();
        a.paymentMethod = paymentMethod;
        //备注
        var paymentRemarks = table.find('tr').eq(i).find('td:eq(15)').text();
        a.paymentRemarks = paymentRemarks;

        result.data.push(a);
    }


    var obj = JSON.stringify(result);

    $.ajax({
        url: "/statistics/updateReceivables",
        type: "post",
        data: obj,
        // datatype: "json",
        contentType: 'application/json;charset=UTF-8',
        success: function (data) {
            alert("修改成功");
        }
    });
    // });
}

/**
 * 防止多次提交
 */
function prevent_reloading() {
    var pendingRequests = {};
    jQuery.ajaxPrefilter(function (options, originalOptions, jqXHR) {
        var key = options.url;
        console.log(key);
        if (!pendingRequests[key]) {
            pendingRequests[key] = jqXHR;
        } else {
            //jqXHR.abort();    //放弃后触发的提交
            pendingRequests[key].abort();   // 放弃先触发的提交
        }
        var complete = options.complete;
        options.complete = function (jqXHR, textStatus) {
            pendingRequests[key] = null;
            if (jQuery.isFunction(complete)) {
                complete.apply(this, arguments);
            }
        };
    });
}

