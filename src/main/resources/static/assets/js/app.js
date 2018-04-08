if (!('localStorage' in window)) {
 
   // noinspection JSAnnotator
    window.localStorage = (function() {
       var documentElement, isIE = !!document.all;
 		
       if (isIE) {
           documentElement = document.documentElement;
           documentElement.addBehavior('#default#userdata');
       }
 
       return {
           setItem: function(key, value) {
               if (isIE) {
                   documentElement.setAttribute('value', value);
                   documentElement.save(key);
               }
               else {
                   window.globalStorage[location.hostname][key] = value;
               }
           },
           getItem: function(key) {
               if (isIE) {
                   documentElement.load(key);
                   return documentElement.getAttribute('value');
               }
 
               return window.globalStorage[location.hostname][key];
           },
           removeItem: function(key) {
               if (isIE) {
                   documentElement.removeAttribute('value');
                   documentElement.save(key);
               }
               else {
                   window.globalStorage[location.hostname].removeItem(key);
               }
           }
       };
   })();
 
}
 




navInfo = strToJson(localStorage.getItem('navInfo')) 
function strToJson(str){
    var json = (new Function("return " + str))();
    return json;
}
//写入
//localStorage.setItem('name', 'shuiniuer');
//读取
//localStorage.getItem('name');
//删除
//localStorage.removeItem('name');


Vue.component('mine-nav', {
   props: ['navInfo'],
  data: function () {
    return {
    }
  },
  template: '<div class="layout-nav">'+
	  			'<span v-for="item in navInfo" :key="item.url" >'+
					'<menu-item :name="item.url" v-if="typeof(item.child)==\'undefined\'">'+
						'<icon :type="item.icon"></icon>'+
						'{{item.name}}'+
					'</menu-item>'+
					'<submenu v-else :name="item.url">'+
	                    '<template slot="title">'+
	                        '<icon :type="item.icon"></icon>'+
	                        '{{item.name}}'+
	                    '</template>'+
	                    '<menu-item v-for="itemChild in item.child" :key="itemChild.url" :name="itemChild.url">{{itemChild.name}}</menu-item>'+
	                '</submenu>'+
				'</span>'+
			'</div>',
})

/*<div class="layout-nav">
		<span v-for="item in navInfo" :key="item.url" >
			<menu-item :name="item.url" v-if="typeof(item.child)=='undefined'">
				<icon :type="item.icon"></Icon>
				{{item.name}}
			</menu-item>
			<submenu v-else :name="item.url">
                <template slot="title">
                    <icon :type="item.icon"></icon>
                    {{item.name}}
                </template>
                <menu-item v-for="itemChild in item.child" :key="itemChild.url" :name="itemChild.url">{{itemChild.name}}</menu-item>
            </submenu>
		</span>
</div>*/