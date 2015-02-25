/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


            var disableOnStart = function(componentWidgetVar) {
                var c = PrimeFaces.widgets[componentWidgetVar];
                if (c === null) return;
                document.getElementById(c.id).firstChild.innerHTML = 'Processing...';
                c.disable();
            };
            var enabledOnComplete = function(componentWidgetVar, title) {
                var c = PrimeFaces.widgets[componentWidgetVar];
                if (c === null) return;
                document.getElementById(c.id).firstChild.innerHTML = title;
                c.enable();
            };
            var after = function() {
               console.log('---------------completed--------------');  
            };