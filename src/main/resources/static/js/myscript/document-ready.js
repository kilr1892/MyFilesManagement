$(document).ready(function () {
    var location = window.location.href;
    // console.log(location);
    // 先找到/order这个斜杠
    var slashNumber = location.indexOf('/', 7);
    // console.log("第一个num" + number);
    // 从order开始截取
    var subLocation = location.substring(slashNumber + 1);
    // console.log(subLocation);
    // 这个是第二个斜杆的值
    var slashNumber2 = subLocation.indexOf('/');
    // 获取 order
    var openId = subLocation.substring(0, slashNumber2);
    // console.log(activeIdFirst);

    // 获取 list及之后的一串
    var activeId = subLocation.substring(slashNumber2 + 1);
    // console.log(activeId);

    // 如果有参数? 则获取?的位置, 如果有/ 获取斜杆的位置
    var sNumber = activeId.indexOf('/');
    var qNumber = activeId.indexOf('?');
    if (sNumber !== -1) {
        activeId = activeId.substring(0, sNumber);
    }
    if (qNumber !== -1) {
        activeId = activeId.substring(0, qNumber);
    }

    // var lastSlash = location.lastIndexOf('/');
    // var activeId = location.substring(lastSlash + 1);
    // 选择class设置打开
    $('#' + openId + activeId).addClass('active');
    // var openId = location.substring(location.lastIndexOf("/", slashNumber2 - 1) + 1, slashNumber2);
    $('#' + openId + 'bar').addClass('open');
});
