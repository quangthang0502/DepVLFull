/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function () {

    $('#signup').submit(function (e) {

        var data = $('#signup_form').serialize();
        var url = "./RegisterServlet?act=signup";
        var checkuser = checkUserName($('#username').val());
        var checkpass = checkPass($('#password').val());
        var checkrp = checkRP($('#password').val(), $('#repeatpass').val());
        var checkemail = checkEmail($('#email').val());
        if (checkuser && checkpass && checkrp && checkemail) {
            $.ajax({
                url: url,
                data: data,
                dataType: 'json',
                type: 'POST',
                async: false,
                success: function (data) {
                        
                },
                error: function (data) {

                }
            });
        }
        else
            alert("sai thong tin");

        e.preventDefault();
        return false;
    });
});

function submitt() {
    var checkuser = checkUserName($('#username').val());
    var checkpass = checkPass($('#password').val());
    var checkrp = checkRP($('#password').val(), $('#repeatpass').val());
    var checkemail = checkEmail($('#email').val());
    if (checkuser && checkpass && checkrp && checkemail) {
        $('#signup').submit();
    }
    else
        alert("sai thong tin");
}

function checkUserName(username) {
    var url = "./UserServlet?user_name=" + username;
    var result;
    $.ajax({
        url: url,
        type: "GET",
        dataType: "JSON",
        async: false,
        success: function (data) {

            if (data.userId === 0) {

                result = true;
            } else {
                result = false;
            }

        },
        error: function (a, b, c) {

        }

    });
    return result;
}

function checkPass(password) {
    var passw = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
    return passw.test(password);
}
function checkRP(password, rpassword) {
    if (!checkPass(password))
        return false;
    if (password == rpassword)
        return true;
    else
        return false;
}

function checkEmail(email) {
    if (email != "")
        return true;
    else
        return false;
}
