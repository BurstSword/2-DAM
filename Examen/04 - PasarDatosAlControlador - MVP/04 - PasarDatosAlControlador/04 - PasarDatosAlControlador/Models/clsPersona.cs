using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace _04___PasarDatosAlControlador.Models
{
    public class clsPersona
    {
        private int idDpto;
        public clsPersona()
        {

        }

        public clsPersona(int id, DateTime fechaNacimiento, string nombre, string apellidos, string direccion, string telefono, int idDpto)
        {
            this.idPersona = id;
            this.fechaNacimiento = fechaNacimiento;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.direccion = direccion;
            this.telefono = telefono;
            this.idDpto = idDpto;
        }

        public int idPersona { get; set; }

        [DisplayFormat(DataFormatString = "{0:yyyy/MM/dd}")]
        public DateTime fechaNacimiento { get; set; }

        public string direccion { get; set; }

        public string telefono { get; set; }

        public string nombre { get; set; }

        public string apellidos { get; set; }
        
        public int idDptos { get; set; }
    }
}