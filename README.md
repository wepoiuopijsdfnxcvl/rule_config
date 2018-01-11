 var url = getContextPath()+"/markwindow/save";
/*        location.href = getCtxPath()+"/markwindow/save";*/
        var form = new FormData();
        form.append("marketWindowId", data.field.marketWindowId);
        form.append("title", data.field.title);
        form.append("url", data.field.url);
        form.append("frequency", data.field.frequency);
        form.append("versionStart", data.field.versionStart);
        form.append("sort", data.field.sort);
        form.append("activityId", data.field.activityId);
        form.append("versionEnd", data.field.versionEnd);
        // form.append("versionStart", id_array.join(","));
        form.append("isClosed", data.field.isClosed);
        form.append("clientType", data.field.clientType);
        form.append("maxTimes", data.field.maxTimes);
         form.append("startTime1", data.field.startTime);
        form.append("endTime1", data.field.endTime);
        form.append("pic_one", pic_one); // 上传的文件
        var xhr = null; // XMLHttpRequest 对象
        if (window.XMLHttpRequest) {
            xmlhttp = new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        if (xmlhttp != null) {
            xmlhttp.open("post", url, true); // 第3个参数表示是否异步请求
            xmlhttp.send(form);// 提交参数
            xmlhttp.onreadystatechange = sendata; // 当
        } else {
            alert("Your browser does not support XMLHTTP.");
        }
        return false;// 阻止跳转页面，只有保存成功时才跳转
    });
