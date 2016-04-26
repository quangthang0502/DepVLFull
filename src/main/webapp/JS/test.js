/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function testAppend(image, key) {
    var id = "test" + key;
    var newElement = document.createElement("div");
    newElement.id = id;
    $("#test").after(newElement);
    var test = $("#"+id);
    console.log(test);
    $.ajax({
        url: 'image.html',
        type: 'get',
        async: false,
        success: function (html) {
            var h = $.parseHTML(html);
            test.append(h);

        }
    });
    var img = test.children().children().children().children()[1];
    img.src = image;

}


                   