import React from "react";
import ReactDOM from "react-dom";
import App from './App.js';


//funcion recibe dos parametros, componente y la etiqueta
//todo lo que yo ponga en el queryselector me aparecerá en el div indicado por el id
ReactDOM.render(<App/>, document.querySelector("#root"));

