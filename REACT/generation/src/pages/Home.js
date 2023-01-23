import React ,{useState} from "react";
import { TableComponent, TextComponent } from "../components";

const usuario1=[{
    nombre:"Joseph",
    apellido:"Joestar",
    correo:"jo.jo@gmail.com"
  },
  {
    nombre:"Josuke",
    apellido:"Higashikata",
    correo:"jojo@gmail.com"
  },
  {
    nombre:"Marco",
    apellido:"Povea",
    correo:"marco@gmail.com"
  }
  ]

  const tarjeta1=[{
    numero:"1",
    nombre:"Tarjeta Nicolás"
}
  ]

const HomePage = () =>{
    const[ user , setUser] =useState(usuario1);
    const userDelete=(nombreUsuario)=>{
        const changeUser = user.filter(usuario => usuario.nombre != nombreUsuario);
        //al momento de ocupar la funcion setState, yo le voy a cambiar el valor temporal a mis usuarios. 
        setUser(changeUser)
    }
    const[ card , setCard] =useState(tarjeta1);
    const cardDelete=(numeroCarta)=>{
        const changeCard = card.filter(tarjeta => tarjeta.numero != numeroCarta);
        //al momento de ocupar la funcion setState, yo le voy a cambiar el valor temporal a mis usuarios. 
        setCard(changeCard)
    }

    return(
        <div>
            <TextComponent/>
            <TableComponent usuarios={user} tarjetas={card} deleteUser={userDelete} deleteCard={cardDelete} />
        </div>
    )
}

export default HomePage;