 type="text/javascript">
    $(document).ready(function(){

    $("#submit").click(function(){
        $.ajax({
            type: "POST",
            data:"{\"username\":\"Fatma\"}",
            contentType: "application/json; charset=utf-8",
            url: "http://localhost:9999/eng/v1/user/profile/yas",
            success: function(data1) {
                console.log("response:" + data1);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                console.log(' Error in processing!');
            }
        });
    });
});
