/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function getCommentData(imgId) {
    var url = "./CommentServlet?imgid=" + imgId;
    var data1;
    $.ajax({
        url: url,
        type: 'GET',
        dataType: 'JSON',
        async: false,
        success: function (data) {
            data1 = data;
        },
        error: function () {
            console.log("sai roi");
        }
    });
    return data1;
}

function sendComment(jsonObject) {
    var url = "./CommentServlet?post=true";
    $.ajax({
        url: url,
        type: 'POST',
        contentType: 'application/json',
        dataType: 'JSON',
        data: JSON.stringify( jsonObject),
        
        success: function (data) {
            alert(data.id + "  " + data.imgId + "  " + data.comment );
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(errorThrown + " " + textStatus);
        }
    });
}