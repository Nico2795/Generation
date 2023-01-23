import React, { useState } from "react";

const TableComponent = ({ usuarios, deleteUser , deleteCard,tarjetas}) => {
  return (
    <div class="container">
      <table class="table">
        <thead>
          <tr class="table-primary">
            <th scope="col">#</th>
            <th scope="col">Nombre</th>
            <th scope="col">Apellido</th>
            <th scope="col">Correo</th>
            <th scope="col">Acciones</th>
          </tr>
        </thead>
        <tbody>
          {usuarios.map((usuario) => (
            <tr>
              <th scope="row">1</th>
              <td>{usuario.nombre}</td>
              <td>{usuario.apellido}</td>
              <td>{usuario.correo}</td>
              <td>
                <button
                  type="button"
                  class="btn btn-danger"
                  onClick={() => {
                    deleteUser(usuario.nombre);
                  }}
                >
                  Eliminar
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
      
      <div class="card" style={{width: '18rem'}}>
            <img class="card-img-top" src={require("./logo192.png")} alt="Card image cap"/>
              <div div class="card-body">
                {tarjetas.map((tarjeta)=>(
                  <div>
                  <h5 class="card-title">Card title</h5>
                  <p>{tarjeta.numero}</p>
                  <p>{tarjeta.nombre}</p>
              <button
                  type="button"
                  class="btn btn-danger"
                  onClick={() => {
                    deleteCard(tarjeta.numero);
                  }}
                >
                  Eliminar
                </button>
                </div>
                ))}
              
        </div>
</div>
      </div>
  );
};

export default TableComponent;
