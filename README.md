#PreRequisites:
1) node.js version v6.9+ download it from here https://nodejs.org/en/download/
2) Update the npm (node package manger) 												-> npm install npm@latest -g
3) Install typescript via NPM which is inbuilt of nodejs 	                            -> npm install -g typescript@latest
4) Install angular-cli  																-> npm install @angular/cli@latest

#Steps to run Application in development mode:
1) clone project in a folder.
2) open terminal, and go to directory having package.json
3) Install all the dependencies of the project as specified in package.json using 		-> npm install,
4) them serve the application using														-> ng serve
5) Open browser, hit on url http://localhost:4200

#Important commands to create new angular 2 parts:
 Component	    ng g component my-new-component
 Directive	    ng g directive my-new-directive
 Pipe	        ng g pipe my-new-pipe
 Service	    ng g service my-new-service
 Class	        ng g class my-new-class
 Interface	    ng g interface my-new-interface
 Enum	        ng g enum my-new-enum
 Module	        ng g module my-module