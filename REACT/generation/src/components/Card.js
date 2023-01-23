import React from "react";

const CardComponent = (tarjetas, deleteCard)=>{
    return(
        <div class="card" style={{width: '18rem'}}>
            <img class="card-img-top" src="..." alt="Card image cap"/>
           <div div class="card-body">
            {tarjetas.map((tarjeta)=>(
                

              <h5 class="card-title">Card title</h5>
              <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
              <a href="#" class="btn btn-primary">Go somewhere</a>
        </div>
</div>
    )
}