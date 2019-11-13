<!DOCTYPE html>
<html lang="cmn-Hans">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/perfect-scrollbar.min.js"></script>
    <script src="/js/main.min.js"></script>


    <script src="/js/bootstrap-select/bootstrap-select.min.js"></script>
    <script src="/js/bootstrap-select/i18n/defaults-zh_CN.min.js"></script>

    <script src="/js/myscript/document-ready.js"></script>
    <script src="js/bootstrap-paginator/bootstrap-paginator.js"></script>

    <link rel="icon" href="/images/favicon.ico" type="image/ico">
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/materialdesignicons.min.css" rel="stylesheet">
    <link href="/css/bootstrap-select.min.css" rel="stylesheet">
    <link href="/css/style.min.css" rel="stylesheet">
</head>
<body>
<#--<#include "common/header.ftl">-->
<div class="lyear-layout-web">
    <div class="lyear-layout-container">
        <!--左侧导航-->
        <#include "common/sidebar.ftl" >
        <!--End 左侧导航-->

        <!--头部信息-->
        <#include "common/header.ftl" >
        <!--End 头部信息-->

        <!--页面主要内容-->
        <main class="lyear-layout-content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-header">
                                <div class="card-toolbar clearfix">
                                    <form class="pull-left form-inline" action="/download" method="get" id="searchOrderForm">
                                        <div class="form-group">
                                            <label class="control-label">日&nbsp;&nbsp;&nbsp;&nbsp;期&nbsp;&nbsp;
                                                <#if searchPojo.searchDate??>
                                                    <input type="date" class="form-control my-form-control" name="searchDate" value="${dateString}">
                                                <#else >
                                                    <input type="date" class="form-control my-form-control" name="searchDate">
                                                </#if>

                                            </label>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label">&nbsp;&nbsp;文件名称&nbsp;&nbsp;
                                                <#if searchPojo.searchFileName??>
                                                    <input type="text" class="form-control my-form-control" value="${searchPojo.searchFileName}" name="searchFileName">
                                                    <#else >
                                                        <input type="text" class="form-control my-form-control" value="" name="searchFileName">
                                                </#if>


                                            </label>
                                        </div>

                                        <div class="form-group">
                                            <label class="form-inline">&nbsp;&nbsp;
                                                <input type="submit" class="btn btn-primary btn-lg" value="搜索"/>
                                            </label>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">


                                    <table class="table table-bordered table-striped table-hover">
                                        <thead>
                                        <tr>
                                            <th>文件名</th>
                                            <th>上传日期</th>
                                            <th>文件大小</th>
                                            <th>上传人</th>
                                            <th>评分</th>
                                            <th>操作</th>
                                        </tr>
                                        </thead>
                                        <#list listFileData as data>
                                            <tr>
                                                <td>${data.fileOriginalName}</td>
                                                <td>${data.fileCreatedDate?datetime}</td>
                                                <td>${data.fileSize} kb</td>
                                                <td>${data.fileCreatedByName}</td>
                                                <td>${data.fileResourceId}</td>
                                                <td><a href="download/${data.fileName}">下载</a></td>
                                            </tr>
                                        </#list>
                                    </table>


                                </div>
                                <div class="row">
                                    <div class="col-md-6 col-md-offset-4">
                                        <div>
                                            <ul id='bp-3-element-test'></ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
</div>
</body>
<script>

    $(function () {
        // alert("asdfasf");
        var element = $('#bp-3-element-test');


        var currentPage =${pageInfo.pageNum};
        var totalPages = ${pageInfo.pages};

        var options = {
            size: "large",
            bootstrapMajorVersion: 3,
            currentPage: currentPage,
            // 一次显示几页
            numberOfPages: 10,
            totalPages: totalPages,
            itemTexts: function (type, page, current) {
                switch (type) {
                    case "first":
                        return "首页";
                    case "prev":
                        return "上一页";
                    case "next":
                        return "下一页";
                    case "last":
                        return "末页";
                    case "page":
                        return page;
                }
            },
            onPageClicked: function (event, originalEvent, type, page) {
                location.href = "/download?pageNum=" + page;
            }
        };
        element.bootstrapPaginator(options);
    });
</script>
</html>