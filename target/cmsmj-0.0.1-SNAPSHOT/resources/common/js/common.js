/**
 * 记录每次菜单点击位置
 */
$(function(){
    setMeuSelectAction();
    $("body").click(function(event) {
        var elm = event.target;
        var _elm = $(elm);

        var dr = _elm.data("clickstatus");
        if (dr) {
            var _sessionStorage = document.sessionStorage;
            if (_sessionStorage) {
                _sessionStorage.setItem("menu_active", dr);
            } else {
                $.cookie("menu_active", dr);
            }
        }

    });;

    /**
     * 
     */
    function setMeuSelectAction() {
        var _sessionStorage = document.sessionStorage;
        var _select_status = null;
        if (_sessionStorage) {
            _select_status = _sessionStorage.getItem("menu_active");
        } else {
            _select_status = $.cookie("menu_active");
        }
       
        if (_select_status) {
            $("[data-clickstatus='" + _select_status + "']").parent("li").addClass("cur");
        }
          
    }


});
