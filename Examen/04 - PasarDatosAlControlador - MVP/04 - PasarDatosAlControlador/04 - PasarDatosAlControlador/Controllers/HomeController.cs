
using _04___PasarDatosAlControlador.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace _04___PasarDatosAlControlador.Controllers
{
    public class HomeController : Controller
    {
        PersonaYDepartamento personaYDepartamento;
        public ActionResult Editar()
        {
            clsPersona persona = new clsPersona(1,new DateTime(1998/11/23),"Miguel","Espigares Recio", "Calle Invent","666666666",1);
            List<clsDepartamento> listaDpto = new List<clsDepartamento>();

            listaDpto.Add(new clsDepartamento("Informatica", 1));
            listaDpto.Add(new clsDepartamento("Informatica1", 2));
            listaDpto.Add(new clsDepartamento("Informatica2", 3));
            listaDpto.Add(new clsDepartamento("Informatica3", 4));

             personaYDepartamento = new PersonaYDepartamento(persona,listaDpto);

            return View(personaYDepartamento);
        }


        [HttpPost]
        public ActionResult Editar(PersonaYDepartamento personaYDepartamento)
        {
            //Aquí iría la persona a la base de datos

            return View("PersonaModificada", personaYDepartamento);
        }
    }
}