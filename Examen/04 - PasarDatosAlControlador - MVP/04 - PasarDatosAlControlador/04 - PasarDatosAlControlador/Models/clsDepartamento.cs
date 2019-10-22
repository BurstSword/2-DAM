using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace _04___PasarDatosAlControlador.Models
{
    public class clsDepartamento
    {
        private String nombre;
        private int id;

        public clsDepartamento()
        {
            this.nombre = "";
            this.id = 0;
        }

        public clsDepartamento(String nombre, int id)
        {
            this.nombre = nombre;
            this.id = id;
        }

        public String Nombre { get; set; }
        public int Id { get; set; }
    }

   

}
