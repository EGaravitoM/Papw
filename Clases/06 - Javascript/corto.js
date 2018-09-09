function CortoCirtuito() {
    var u = { // JSON
        nombre : "Alberto",
        edad : 31,
        GetName : function(){
            return this.nombre;
        }
    }

    // Si existe un usuario, obtener su nombre
    var name = u && u.GetName();
    /* name = name || "Pepito"; */

    alert(name);
}