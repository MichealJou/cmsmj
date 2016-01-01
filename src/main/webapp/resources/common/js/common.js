/**
 * 记录每次菜单点击位置
 */
$(function(){
    setMeuSelectAction();
    $("body").click(function(event) {
        var elm = event.target;
        var _elm = $(elm);

        var dr = _elm.data("clickstatus");
        var lefts = _elm.data("menustatus");
        
        if (dr) {
            var _sessionStorage = document.sessionStorage;
            if (_sessionStorage) {
                _sessionStorage.setItem("menu_active", dr);
            } else {
                $.cookie("menu_active", dr);
            }
        }
       if(lefts){
    	   var _sessionStorage = document.sessionStorage;
           if (_sessionStorage) {
               _sessionStorage.setItem("menu_active_left", lefts);
           } else {
               $.cookie("menu_active_left", lefts);
           }
       }
       
    });;

    /**
     * 
     */
    function setMeuSelectAction() {
        var _sessionStorage = document.sessionStorage;
        var _select_status = null;
        var _select_left_status = null;
        if (_sessionStorage) {
            _select_status = _sessionStorage.getItem("menu_active");
            _select_left_status = _sessionStorage.getItem("menu_active_left");
        } else {
            _select_status = $.cookie("menu_active");
            _select_left_status = $.cookie("menu_active_left");
        }
       
        if (_select_status) {
            $("a[data-clickstatus='" + _select_status + "'].active").parent("li").addClass("cur");
        }
        
        console.log(_select_left_status);
        if(_select_left_status){
        	$("a[data-leftmenustatus='"+_select_left_status+"']").parent("li").addClass("cur");
        }else{
        	$("a[data-leftmenustatus='1']").parent("li").addClass("cur");
        }
    }


});
