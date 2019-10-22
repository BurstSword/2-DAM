using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace _04___PasarDatosAlControlador.Models
{
    public class PersonaYDepartamento
    {
        private clsPersona _persona;
 
        private List<clsDepartamento> listaDpto;

       

        public PersonaYDepartamento()
        {

        }

        public PersonaYDepartamento(clsPersona persona, List<clsDepartamento> listDpto)
        {
            this._persona = persona;
            this.listaDpto = listDpto;
            
        }

        public clsPersona persona
        {
            get
            {
                return _persona;
            }
            set
            {
                _persona = value;
            }
        }
        public List<clsDepartamento> ListaDpto {
            get
            {
                return listaDpto;
            }
            set
            {
                listaDpto = value;
            }


        }
    }
}