import React from "react";
//Nos permiten la navegacion dentro de nuestro sitio web, tenemos distintas paginas relacionadas a nuestar url. 
import {BrowserRouter, Routes, Route} from "react-router-dom";
import { HomePage } from "./pages";

const App = () => {
  return(
    //desde el navegador
    <BrowserRouter>
    {/* Distintas rutas */}
      <Routes>
        {/* Especificamos cada ruta */}
        <Route path="/" element={<HomePage/>}/>
      </Routes>
    </BrowserRouter>
  )
}

export default App;