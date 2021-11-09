(this["webpackJsonpchallenges-frontend"]=this["webpackJsonpchallenges-frontend"]||[]).push([[0],{14:function(e,t,n){},15:function(e,t,n){},17:function(e,t,n){"use strict";n.r(t);var s=n(1),a=n.n(s),u=n(6),c=n.n(u),r=(n(14),n.p,n(15),n(7)),i=n(3),h=n(4),l=n(2),o=n(9),b=n(8),j=function(){function e(){Object(i.a)(this,e)}return Object(h.a)(e,null,[{key:"challenge",value:function(){return fetch(e.SERVER_URL+e.GET_CHALLENGE)}},{key:"sendGuess",value:function(t,n,s,a){return fetch(e.SERVER_URL+e.POST_RESULT,{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify({userAlias:t,factorA:n,factorB:s,guess:a})})}}]),e}();j.SERVER_URL="http://localhost:8080",j.GET_CHALLENGE="/challenges/random",j.POST_RESULT="/attempts";var d=j,g=n(0),f=function(e){Object(o.a)(n,e);var t=Object(b.a)(n);function n(e){var s;return Object(i.a)(this,n),(s=t.call(this,e)).state={a:"",b:"",user:"",message:"",guess:0},s.handleSubmitResult=s.handleSubmitResult.bind(Object(l.a)(s)),s.handleChange=s.handleChange.bind(Object(l.a)(s)),s}return Object(h.a)(n,[{key:"componentDidMount",value:function(){var e=this;d.challenge().then((function(t){t.ok?t.json().then((function(t){e.setState({a:t.factorA,b:t.factorB})})):e.updateMessage("Can't reach the server")}))}},{key:"handleChange",value:function(e){var t=e.target.name;this.setState(Object(r.a)({},t,e.target.value))}},{key:"handleSubmitResult",value:function(e){var t=this;e.preventDefault(),d.sendGuess(this.state.user,this.state.a,this.state.b,this.state.guess).then((function(e){e.ok?e.json().then((function(e){e.correct?t.updateMessage("Congratulations! Your guess is correct"):t.updateMessage("Oops! Your guess "+e.resultAttempt+" is wrong, but keep playing!")})):t.updateMessage("Error: server error or not available")}))}},{key:"updateMessage",value:function(e){this.setState({message:e})}},{key:"render",value:function(){return Object(g.jsxs)("div",{children:[Object(g.jsxs)("div",{children:[Object(g.jsx)("h3",{children:"Your new challenge is "}),Object(g.jsxs)("h1",{children:[this.state.a," x ",this.state.b]})]}),Object(g.jsxs)("form",{onSubmit:this.handleSubmitResult,children:[Object(g.jsxs)("label",{children:["Your alias:",Object(g.jsx)("input",{type:"text",maxLength:"12",name:"user",value:this.state.user,onChange:this.handleChange})]}),Object(g.jsx)("br",{}),Object(g.jsxs)("label",{children:["Your guess:",Object(g.jsx)("input",{type:"number",min:"0",name:"guess",value:this.state.guess,onChange:this.handleChange})]}),Object(g.jsx)("br",{}),Object(g.jsx)("input",{type:"submit",value:"Submit"})]}),Object(g.jsxs)("h4",{children:[" ",this.state.message," "]})]})}}]),n}(s.Component);var p=function(){return Object(g.jsx)("div",{className:"App",children:Object(g.jsx)("header",{className:"App-header",children:Object(g.jsx)(f,{})})})},O=function(e){e&&e instanceof Function&&n.e(3).then(n.bind(null,18)).then((function(t){var n=t.getCLS,s=t.getFID,a=t.getFCP,u=t.getLCP,c=t.getTTFB;n(e),s(e),a(e),u(e),c(e)}))};c.a.render(Object(g.jsx)(a.a.StrictMode,{children:Object(g.jsx)(p,{})}),document.getElementById("root")),O()}},[[17,1,2]]]);
//# sourceMappingURL=main.5af60938.chunk.js.map