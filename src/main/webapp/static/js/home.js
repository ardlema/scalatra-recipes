$(document).ready(function() {
    $("#myAjaxButton").click(function(e) {
         e.preventDefault();

         getContent('/ajax');
       });
});


function getContent(ajaxUrl) {

    $.ajax({
            url: ajaxUrl,
            async:true,
            beforeSend: function(objeto){

            },
            complete: function(objeto, exito){

                if(exito=="success"){

                }
            },
            contentType: "application/x-www-form-urlencoded",
            dataType: "text",
            error: function(objeto, quepaso, otroobj){
                alert("Error ajax: "+quepaso);

            },
            global: true,
            ifModified: false,
            processData:true,
            success: function(datos){
                alert('modify ajax');
                $("#ajaxResponse").val(datos);

            },
            timeout: 3000,
            type: "GET"
    });
}



