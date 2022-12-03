/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8_progra1_carlos_noé;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author cd507
 */
public class Lab8_Progra1_Carlos_Noé {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner G2HOPE = new Scanner(System.in);
        System.out.println("Bienvenido");
        int menu = scanner.nextInt();
        while (menu != 3) {
            if ((menu > 0) && (menu < 3)) {
                switch (menu) {
                    case 1:
                        int contp = 0;
                        ArrayList<Pokes> ListaPJ1 = new ArrayList();
                        ArrayList<Pokes> ListaPJ2 = new ArrayList();
                        System.out.println("Ingrese la cantidad de pokes que desea jugar 1 ->3 (P1)");
                        int PK1 = scanner.nextInt();
                        System.out.println("Ingrese la cantidad de pokes que desea jugar 1 ->3 (P2)");
                        int PK2 = scanner.nextInt();
                        if ((PK1>3)&&(PK2>3)&&(PK1<0)&&(PK2<0)) {
                            System.out.println("Ingrese Valores decuados");
                            break;
                        }
                        for (int i = 0; i < PK1; i++) {
                            System.out.println("Ingrese el nombre: ");
                            String NONE = G2HOPE.nextLine();
                            System.out.println("Ingrese la vida: ");
                            int HEL = scanner.nextInt();
                            System.out.println("Ingrese el danio");
                            int DAMA = scanner.nextInt();
                            int Random = new Random().nextInt((5 - 1) + 1) + 1;
                            if (HEL>200) {
                                System.out.println("Tramposo");
                                break;
                            }
                            Pokes DEL = new Pokes(NONE, HEL, DAMA, Random);
                            ListaPJ1.add(DEL);
                        }
                        for (int i = 0; i < PK2; i++) {
                            System.out.println("Ingrese el nombre: ");
                            String NONE = G2HOPE.nextLine();
                            System.out.println("Ingrese la vida: ");
                            int HEL = scanner.nextInt();
                            System.out.println("Ingrese el danio");
                            int DAMA = scanner.nextInt();
                            int Random = new Random().nextInt((5 - 1) + 1) + 1;
                                if (HEL>200) {
                                System.out.println("Tramposo");
                                break;
                            }
                            Pokes DEL = new Pokes(NONE, HEL, DAMA, Random);
                            ListaPJ2.add(DEL);
                            boolean flagB= true;
                        }
                        while ((ListaPJ1.size() != 0) && (ListaPJ2.size() != 0)) {

                                
                            System.out.println(ListaPJ1.size());
                            System.out.println(ListaPJ2.size());
                            Pokes Jug1 = ListaPJ1.get(0);
                            Pokes Jug2 = ListaPJ2.get(0);
                            boolean Winner = Battle(Jug1, Jug2);
                            if (Winner == true) {
                                System.out.println(Jug1.Name + " Es el ganador");
                                ListaPJ2.remove(0);

                            } else {
                                System.out.println(Jug2.Name + " Es el ganador");
                                ListaPJ1.remove(0);
                            }
//                            if (ListaPJ1.size()==0) {
//                                flagB =false;
//                            }else{
//                                flagB =false;
//                            }
                        }
                        System.out.println("Estoy antes del if");
                        if (ListaPJ1.size()==0) {
                            System.out.println("Jugador 1 ya no puede continuar");

                        } else if(ListaPJ2.size()==0){
                            System.out.println("Jugador 2 ya no puede continuar");
                        }

                        break;
                    case 2:
                        ArrayList<Lista> SupersMV = new ArrayList();
                        ArrayList<Lista> SupersDC = new ArrayList();
                        
                        
                        Lista Batman = new Lista("Batman", "brucewayne", "gotham", "DC");
                        Lista Robin = new Lista("Robin", "dickwayne", "gotham", "DC");
                        Lista WonderWoman = new Lista("WonderWoman", "DianaPrince", "Temiscira", "DC");
                        Lista SuperMan = new Lista("SuperMan", "JosephClark", "Krypton", "DC");
                        Lista Starfire = new Lista("Starfire", "KoryAnders", "Tamaran", "DC");
                        Lista Penguin = new Lista ("Penguin"," OswaldChesterfield", "Cobblepot", "DC");
                        Lista Joker= new Lista ("Joker","?","?","DC");
                        Lista HarleyQueen= new Lista("HarleyQueen", "HarleenFrances","gotham","DC");
                        Lista CatWoman= new Lista("Catwoman","Selina Kyle","?","DC");
                        Lista Raven= new Lista ("Raven","RachelRoth","Azarath","DC");
                        
                        
                        
                        Lista Ironman = new Lista("Ironman", "TonyStark", "Manhatan", "MV");
                        Lista CaptainAmerica = new Lista("CaptainAmerica", "SteveRoyers", "Manhattan", "MV");
                        Lista Hulk = new Lista("Hulk", "BruceBanner", "Dayton", "MV");
                        Lista SpiderMan = new Lista("SpiderMan", "PeterParker", "Queens", "MV");
                        Lista BlackPanther = new Lista("BlackPanther", "LukeCHarles", "Wakanda", "MV");
                        Lista DeadPool= new Lista("DeadPool","WadeWilson","Canada","MV");
                        Lista Magneto= new Lista ("Magneto", "ErikLehnsherr", "Núremberg", "MV");
                        Lista Lobezno= new Lista("Lobezno","JamesLogan","Alberta","MV" );
                        Lista BrujaEscarlata= new Lista("BrujaEscarlata", "WandaMaximoff", "?","MV");
                        Lista QuickSilver= new Lista("QuickSilver","PietroMaximoff", "?","MV");
                        
                        
                        
                        SupersDC.add(Batman);
                        SupersDC.add(Robin);
                        SupersDC.add(WonderWoman);
                        SupersDC.add(SuperMan);
                        SupersDC.add(Starfire);
                        SupersDC.add(Raven);
                        SupersDC.add(CatWoman);
                        SupersDC.add(HarleyQueen);
                        SupersDC.add(Joker);        
                        SupersDC.add(Penguin);        
                        
                        SupersMV.add(Ironman);
                        SupersMV.add(CaptainAmerica);
                        SupersMV.add(Hulk);
                        SupersMV.add(SpiderMan);
                        SupersMV.add(BlackPanther);
                        SupersMV.add(QuickSilver);
                        SupersMV.add(BrujaEscarlata);
                        SupersMV.add(Lobezno);     
                        SupersMV.add(Magneto);      
                        SupersMV.add( DeadPool);       
                                
                                
                        System.out.println("Desea Buscar(=1) o agregar(=2)?");
                        int Search = scanner.nextInt();
                        
                        
                        
                        if (Search == 1) {
                            System.out.println("Ingrese el nombre del SuperHeroe");
                            String PJ=G2HOPE.nextLine();
                            scanner = new Scanner(System.in);
                            G2HOPE = new Scanner(System.in);
                            System.out.println("Ingrese la franquicia (2 Letras DC/MV)");
                            String franq =scanner.nextLine();
                            if (franq.equalsIgnoreCase("DC")) {
                            for (int i = 0; i< SupersDC.size(); i++) {
                            String Phan= SupersDC.get(i).getName();
                                   if (Phan.equalsIgnoreCase(PJ)) {
                                       SupersMV.get(i).toString();
                                       
                
                                   }
                            }
                                
                            }else if (franq.equalsIgnoreCase("MV")) {
                                for (int i = 0; i< SupersMV.size(); i++) {
                            String Phan= SupersMV.get(i).getName();
                                   if (Phan.equalsIgnoreCase(PJ)) {
                                       SupersMV.get(i).toString();
                
                                   }
                            }
                                
                            }else{
                                System.out.println("Letras Incorrectas");
                                break;
                            }

 
                            
                            
                        } else if (Search == 2) {
                            System.out.println("Ingrese el Alias");
                            String AL=G2HOPE.nextLine();
                            System.out.println("Ingrese el Nombre real");
                            String Nam=scanner.nextLine();
                            System.out.println("Ingrese el lugar de nacimiento");
                            String Pla=G2HOPE.nextLine();
                            System.out.println("Ingrese la franquicia (2 Letras DC/MV)");
                            String franq =scanner.nextLine();
                            if (franq.equalsIgnoreCase("MV")) {
                            Lista X= new Lista(AL, Nam , Pla, franq);
                            SupersMV.add(X);        

                            }else if(franq.equalsIgnoreCase("DC")){
                            Lista X= new Lista(AL, Nam, Pla, franq);
                            SupersDC.add(X);      
    
                                
                            }
                            System.out.println("Se a creado exitosamente");
                            
                            

                        } else {
                            System.out.println("Ingrese un numero entre el rango");
                            break;
                        }

                        break;
                    case 3:
                        break;
                }
                System.out.println("Bienvenido");
                menu = scanner.nextInt();

            } else {
                System.out.println("Ingrese un Numerico de caracter entero o dentro del rango");

            }
        }
    }

    public static boolean Battle(Pokes Poke1, Pokes Poke2) {
        if (Poke1.getLuck() > Poke2.getLuck()) {
            while ((Poke1.getHea() >= 0) || (Poke2.getHea() >= 0)) {
                System.out.println(Poke1.Name + " Ataca Primero, Tiene: " + Poke1.Hea + " y " + Poke1.getLuck() + " Suerte");
                System.out.println(Poke2.Name + " Ataca Segundo, Tiene: " + Poke2.Hea + " y " + Poke2.getLuck() + " Suerte");
                int hiil1 = Poke1.getHea();
                int hiil2 = Poke2.getHea();
                int attk1 = Poke1.getApoints();
                int attk2 = Poke2.getApoints();

                hiil1 = hiil1 - attk2;
                hiil2 = hiil2 - attk1;

                System.out.println("** Puntos Restantes **");
                System.out.println(Poke1.getName() + " Tiene de vida y " + hiil1 + " Restantes");
                System.out.println(Poke2.getName() + " Tiene de vida y " + hiil2 + " Restantes");
                Poke1.setHea(hiil1);
                Poke2.setHea(hiil2);

        if (Poke1.getHea() <= 0) {
            return false;
        } else if(Poke2.getHea() <= 0){
            return true;
        }else {
        }

            }
        } else if (Poke2.getLuck() > Poke1.getLuck()) {
            while ((Poke1.getHea() >= 0) || (Poke2.getHea() >= 0)) {
                System.out.println(Poke2.Name + " Ataca Primero, Tiene: " + Poke2.Hea + " y " + Poke2.getLuck() + " Suerte");
                System.out.println(Poke1.Name + " Ataca Segundo, Tiene: " + Poke1.Hea + " y " + Poke1.getLuck() + " Suerte");
                int hiil1 = Poke1.getHea();
                int hiil2 = Poke2.getHea();
                int attk1 = Poke1.getApoints();
                int attk2 = Poke2.getApoints();

                hiil1 = hiil1 - attk2;
                hiil2 = hiil2 - attk1;

                System.out.println("** Puntos Restantes **");
                System.out.println(Poke1.getName() + " Tiene de vida y " + hiil1 + " Restantes");
                System.out.println(Poke2.getName() + " Tiene de vida y " + hiil2 + " Restantes");
                Poke1.setHea(hiil1);
                Poke2.setHea(hiil2);
        if (Poke1.getHea() <= 0) {
            return false;
        } else if(Poke2.getHea() <= 0){
            return true;
        }else {
        }
            }
        } else {
            while ((Poke1.getHea() >= 0) || (Poke2.getHea() >= 0)) {
                System.out.println(Poke1.Name + " Ataca Primero, Tiene: " + Poke1.Hea + " y " + Poke1.getLuck() + " Suerte");
                System.out.println(Poke2.Name + " Ataca Segundo, Tiene: " + Poke2.Hea + " y " + Poke2.getLuck() + " Suerte");
                int hiil1 = Poke1.getHea();
                int hiil2 = Poke2.getHea();
                int attk1 = Poke1.getApoints();
                int attk2 = Poke2.getApoints();

                hiil1 = hiil1 - attk2;
                hiil2 = hiil2 - attk1;

                System.out.println("** Puntos Restantes **");
                System.out.println(Poke1.getName() + " Tiene de vida y " + hiil1 + " Restantes");
                System.out.println(Poke2.getName() + " Tiene de vida y " + hiil2 + " Restantes");
                Poke1.setHea(hiil1);
                Poke2.setHea(hiil2);
        if (Poke1.getHea() <= 0) {
            return false;
        } else if(Poke2.getHea() <= 0){
            return true;
        }else {
        }
            }
        }
        return false;
   }
}

/*        //Instanciando un ArrayList.
        ArrayList<String> lista = new ArrayList();
        
        //Métodos Pricipales.
        
        //agregar.
        lista.add("primero");
        lista.add("segundo");
        lista.add(0, "nuevo primero");
        
//        //Eliminar elementos.
        lista.remove("primero");
        lista.remove(0);
        
        //Acceder a las posiciones. 
         String elemento= lista.get(0); 
         
        //limpia el arraylist. 
         lista.clear();
         
         //Verificar si la lista contiene un elemento.
         if(lista.contains("primero")){
             
         }
          
         //Verificar si el arraylist esta vacio
         if(lista.isEmpty()){
             
         }
         
         
     //Recorrer un arraylist
        //Utilizando un for normal
        for (int i = 0; i < lista.size(); i++) {
            String elementoTemporal= lista.get(i);   
            System.out.println("-> "+elementoTemporal);

        }      
        //Utilizando un for each
        for (String elementoTemporal : lista) {
            System.out.println("-> "+elementoTemporal);
        }   
        
    }*/




/*
// Declaración el ArrayList
ArrayList<String> nombreArrayList = new ArrayList<String>();

// Añadimos 10 Elementos en el ArrayList
for (int i=1; i<=10; i++){
	nombreArrayList.add("Elemento "+i); 
}

// Añadimos un nuevo elemento al ArrayList en la posición 2
nombreArrayList.add(2, "Elemento 3");

// Declaramos el Iterador e imprimimos los Elementos del ArrayList
Iterator<String> nombreIterator = nombreArrayList.iterator();
while(nombreIterator.hasNext()){
	String elemento = nombreIterator.next();
	System.out.print(elemento+" / ");
}
// Recordar que previamente ya hemos declarado el ArrayList y el Iterator de la siguiente forma:
// ArrayList<String> nombreArrayList = new ArrayList<String>();
// Iterator<String> nombreIterator = nombreArrayList.iterator();

// Obtenemos el numero de elementos del ArrayList
int numElementos = nombreArrayList.size();
System.out.println("nnEl ArrayList tiene "+numElementos+" elementos");

// Eliminamos el primer elemento del ArrayList, es decir el que ocupa la posición '0'
System.out.println("n... Eliminamos el primer elemento del ArrayList ("+nombreArrayList.get(0)+")...");
nombreArrayList.remove(0);

// Eliminamos los elementos de ArrayList que sean iguales a "Elemento 3"
System.out.println("n... Eliminamos los elementos de ArrayList que sean iguales a "Elemento 3" ...");
nombreIterator = nombreArrayList.iterator();
while(nombreIterator.hasNext()){
	String elemento = nombreIterator.next();
	if(elemento.equals("Elemento 3"))
		nombreIterator.remove();	// Eliminamos el Elemento que hemos obtenido del Iterator
}

// Imprimimos el ArrayList despues de eliminar los elementos iguales a "Elemento 3"
System.out.println("nImprimimos los elementos del ArrayList tras realizar las eliminaciones: ");
nombreIterator = nombreArrayList.iterator();
while(nombreIterator.hasNext()){
	String elemento = nombreIterator.next();
	System.out.print(elemento+" / ");
}

// Mostramos el numero de elementos que tiene el ArrayList tras las eliminaciones:
numElementos = nombreArrayList.size();
System.out.println("nNumero de elementos del ArrayList tras las eliminaciones = "+numElementos);
*/
