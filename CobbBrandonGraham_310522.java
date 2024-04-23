/*@author cob. 
 *@info the purpose of this program: meditation.
 *@issue
 *@log
   12/09/2019 
   26/10/2019 'sed -e /s\/t/    /g'
   11/08/2019 scaled ASUSZ170A class outside of main, simplifying flashcard
   11/19/2019
   12/09/2019 added "info...\r *...\r *bug...\r *version, added "import java.int...java.io.File...Exception...Int...int...Long...long...java.util.Scanner...java.lang.System...", added multiple longs variable,
                                  added to main() println expression, commented import, created ASUSZ170A constructor and code comment, made flashcard call in main() generic, moved close() into block and flashcard() and molecule()
                                  outside of main(), realigned //, reformatted some block, removed "editor", renamed ASUSZ170A ASUSZ170A to obj.
   03/05/2020 added alch method, character method. appended deprecated text. modified flashcard method.
   03/14/2020
   03/15/2020 replaced /*keyword*/ /*with <>, then <> <> with <>. duplicated nested class 'C'.
   03/28/2020 added copysrc method and incomplete parsesrc method.
   03/29/2020 added parsesrc functionality, compressed fields, removed alchemy methods, scaled copysrc into parsesrc.
   03/30/2020 readded alchemy methods.
 *package ;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              //packageDeclaration         PackageName/src/FolderName\
 *
 *import ;
 *import java.int;
 *import java.io.File;
 *import java.lang.Character;
 *import java.lang.Exception;
 *import java.lang.Integer;
 *import java.lang.Long;
 *import java.lang.System;
 *import java.lang.String;
 *import java.long;
 *import java.util.Random;
 *import java.util.Scanner;
 */
public /*keyword*/ class BrandonGrahamCobb                                                                                                                                                                                                                                                                                                                                                                                                   //instantiation0.00| accessmodifier data|returntype ClassIdentifier/identifier (() if method) //instantiation0.00| Object /*keyword*/ = call ((module-.base).(package-java.).Object).staticfield.(method-)(parameter)
{
  boolean flag;
  Cobb[] array;
  double experience;
  int classn, constructorn, dexterity, fieldn, i, instantiationn, intelligence, j, k, l, level, luck, m, methodn, objectn, strength;
  java.io.File src;
  java.lang.Character c;
  java.lang.String inputfilestring, s, st, str, username;
  java.util.Random rand = new java.util.Random(6); 
  long count, identifier, method, variable;
  
  ///*keyword*/ class Brandon {public /*<>*/ Brandon() {}}
  ///*keyword*/ class Graham {public /*<>*/ Graham() {}}

  /*keyword*/ class Cobb implements java.io.Serializable
  {
    /*<>*/ Cobb()
    {
      dexterity = 4; intelligence = 4; luck = 4; strength = 4;
      experience = 0.0;
      level = 1;
      username = "";
    }

    void sort()
    {
      final java.lang.String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
      java.io.File file = new java.io.File( "/home/cob/Downloads/b1i0o0l8o2g0y" );
      java.util.Scanner sc = new java.util.Scanner(file);
      java.io.PrintWriter p = new java.io.PrintWriter(new java.io.FileWriter( "b1i0o0l8o2g0y", false));
      for (i = 0; sc.hasNextLine(); i++)
      sc.close();
      java.lang.String[] biology = new java.lang.String[1 + i];
      java.util.Scanner sca = new java.util.Scanner(file);
      for (i = 0; sca.hasNextLine); i++)
      {
        biology[i] = sca.nextLine();
      }
      sca.close();
      for (i = 0; flag; i++)
      {
        for (j = 0; ALPHABET.indexOf(biology[i - 1].charAt(j).toLowerCase()).equals(ALPHABET.indexOf(biology[i].charAt(j).toLowerCase())); j++)
        if (ALPHABET.indexOf(biology[i - 1].charAt(j).toLowerCase()) < ALPHABET.indexOf(biology[i].charAt(j).toLowerCase())
        {
          temp = biology[i - 1];
          biology[i - 1] = biology[i];
          biology[i] = temp;
          j = 0;
          flag = true;
        }
        else flag = false;
        if (biology.length() == i - 1) i = 0;
      }    
      for (i = 0; biology.length() > i ; i++) {p.write( biology[i] + "\n" );}
      p.close();
    }

    void /*<>*/ alch()
    {
      java.io.File file = new java.io.File( "/tmp/characters.ser" );
      java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
      java.lang.System.out.println( "hi, welcome to alchemy!" );
      if (file == null)
      {
        Cobb character = new Cobb();
        java.lang.System.out.println( "this is a new game! type a name to create your character." );
        character.setUsername(sc.nextLine());
        java.lang.System.out.println( "let's play!" );
      }
      else
      {
        deserializeCharacters();
        java.lang.System.out.println( "would you like to play a new character? (n/y)" );
        if (sc.nextLine().equals( "n" ))
        {
          Cobb character = new Cobb();
          java.lang.System.out.println( "type a name to create your character." );
          character.setUsername(sc.nextLine());
          java.lang.System.out.println( "here are your stats:" + getStatistics() );
          java.lang.System.out.println( "let's play!" );
        }
        else
        {
          getCharacters();
          java.lang.System.out.println( "which one would you like to play? (#) (default=0)" );
          java.lang.System.out.println( "let's play!" );
          switch (sc.nextInt())
          {
            case 1: ;
            default: ;
          }
        }
      }
      java.lang.System.out.println( "enter a command." ); 
      switch (sc.nextLine())
      {
        case "exit": serializeCharacters(); break;
        default: java.lang.System.out.println( "enter a command." );
      }
    }
    void /*<>*/ deserializeCharacters()
    {
      Cobb[] array = null;
      try {
        java.io.FileInputStream fileIn = new java.io.FileInputStream( "/tmp/characters.ser" );
        java.io.ObjectInputStream in = new java.io.ObjectInputStream(fileIn);
        for (int i = 0; array.length > i; i++) {array = (Cobb[]) in.readObject();}
        in.close();
        fileIn.close();
      } catch (java.io.IOException z) { z.printStackTrace(); return;
      } catch (java.lang.ClassNotFoundException zz) { java.lang.System.out.println( "Cobb not found" ); zz.printStackTrace(); return; }
    }
    void /*<>*/ flashcard()
    {
      java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
      java.lang.System.out.println( "gre?" );
      if (sc.nextLine().equals( "" )) { java.io.File src = new java.io.File( "v" ); }
	   else java.lang.System.out.println( "err" );
      try {
        java.util.Scanner sca = new java.util.Scanner(src);
        java.util.Scanner scan = new java.util.Scanner(src);
        for (i = 0; sca.hasNext(); i++) { sca.next(); }
        java.lang.String string[] = new java.lang.String[i];
        for (i = 0; scan.hasNext(); i++) { string[i] = scan.next(); }
        java.util.Random rand = new java.util.Random();
        for (j = 0; i > j; j++)
        {
    	  k = rand.nextInt(i);
          java.lang.System.out.printf(k + string[k]);
          sc.nextLine();
        }
        sc.close();
        sca.close();
      } catch (java.lang.Exception z) { java.lang.System.out.println(z); }
    }
    int /*<>*/ getCharacterCount() {return array.length;}
    void /*<>*/ getCharacters() {for (int i = 0; array.length > i ;i++) {java.lang.System.out.println(i + " " + array[i].getUsername() );}}
    java.lang.String /*<>*/ getStatistics() {return "";}
    java.lang.String /*<>*/ getUsername() {return username;}
    void /*<>*/ molecule()
    {
      
    }
    void /*<>*/ parsesrc( java.lang.String inputfilestring )
    {
      java.io.File src = new java.io.File( inputfilestring );
      try
      {
        java.util.Scanner sc = new java.util.Scanner(src);
        java.io.PrintWriter p = new java.io.PrintWriter(new java.io.FileWriter( "output.java", false));
        for (; sc.hasNextLine();) {p.write( sc.nextLine() + "\n" );}
        p.close();
        java.io.File src0= new java.io.File( "output.java" );
        java.util.Scanner sca = new java.util.Scanner(src0);
        sca.useDelimiter( " |\\(|\\n" );
        for (;sca.hasNext();)
        {
          s = sca.next();
          if (s.equals( "class" )) {classn++; }
          else if (s.equals( "Boolean" ) || s.equals( "boolean" ) || s.equals( "Character" ) || s.equals( "char" ) || s.equals( "Byte" ) || s.equals( "byte" ) || s.equals( "Short" ) || s.equals( "short" ) || s.equals( "Integer" ) || s.equals( "int" ) || s.equals( "Long" ) || s.equals( "long" ) || s.equals( "Float" ) || s.equals( "float" ) || s.equals( "Double" ) || s.equals( "double" ) || s.equals( "java.lang.String" )) {fieldn++;}
          else if (s.equals( "/*<>*/" ))
          {
            st = sca.next();
            if (c.isUpperCase(st.charAt(0))) {constructorn++;} else methodn++;
          }
        }
        java.lang.String[] classes = new java.lang.String[classn];
        java.lang.String[] constructors = new java.lang.String[constructorn];
        java.lang.String[] fields = new java.lang.String[fieldn];
        //java.lang.String[] instantiations = new java.lang.String[instantiationn];   
        java.lang.String[] methods = new java.lang.String[methodn];
        //java.lang.String[] objects = new java.lang.String[objectn];
        java.util.Scanner scan = new java.util.Scanner(src0);
        scan.useDelimiter( " |\\(|\\n" );
        for (;scan.hasNext();)
        {
          flag = false;
          s = scan.next();
          if (s.equals( "class" )) {classes[i] = scan.next(); i++;}
          else if (s.equals(  "Boolean" ) || s.equals( "boolean" ) || s.equals( "Character" ) || s.equals( "char" ) || s.equals( "Byte" ) || s.equals( "byte" ) || s.equals( "Short" ) || s.equals( "short" ) || s.equals( "Integer" ) || s.equals( "int" ) || s.equals( "Long" ) || s.equals( "long" ) || s.equals( "Float" ) || s.equals( "float" ) || s.equals( "Double" ) || s.equals( "double" ) || s.equals( "java.lang.String" ))
          {
            while (!flag)
            {
              if (j != fieldn )
              {
                fields[j] = scan.next();
                if (fields[j].contains( ";" )) flag = true;
                fields[j] = fields[j].replace(",", "");
                fields[j] = fields[j].replace(";", "");
                fields[j] = fields[j].replace("=", "");
                m++;
              }
              else flag = true;
            }
          }
          else if (s.equals( "/*<>*/" ))
          {
            str = scan.next();
            if (c.isUpperCase(str.charAt(0))) {constructors[k] = str; k++;} else {methods[l] = str; l++;}
          }
        }
        java.lang.System.out.println( "I am Java. I contain...  \n" + classn/*n*/+ " classes:      " + toString(classes) + "\n" + constructorn + " constructors: " + toString(constructors) + "\n" + fieldn + " fields:      " + toString(fields) +  "\n" +methodn/*nu*/ + " methods:      " + toString(methods) );
      } catch (java.lang.Exception z) {java.lang.System.out.println( z.toString() );}
    }
    void /*<>*/ serializeCharacters()
    {
      try
      {
        java.io.FileOutputStream fileOut = new java.io.FileOutputStream( "/tmp/characters.ser" );
        java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(fileOut);
        for (int i = 0; array.length > i; i++) {out.writeObject(array[i]);}
        out.close();
        fileOut.close();
        java.lang.System.out.printf( "Serialized data is saved in /tmp/characters.ser" );
      } catch (java.io.IOException z) {z.printStackTrace(); }
    }
    void /*<>*/ setStatistics()
    {
      dexterity = 4 + rand.nextInt(6);
      intelligence = 4 + rand.nextInt(6);
      luck = 4 + rand.nextInt(6);
      strength = 4 + rand.nextInt(6);
    }
    void /*<>*/ setUsername( java.lang.String username ) {username = username;}
    java.lang.String toString(java.lang.Object[] instanceVariable)
    {
      if (instanceVariable == null) return null;
      int iMax = instanceVariable.length - 1;
      if (iMax == -1) return "[]";
      java.lang.StringBuilder b = new java.lang.StringBuilder();
      b.append('[');
      for (int i = 0;; i++)
      {
        b.append(java.lang.String.valueOf(instanceVariable[i]));
        if(i == iMax) return b.append(']').toString();
        b.append(", ");
      }
    }
  }
  
  public static void /*<>*/ main( java.lang.String args[] )
   {
  	BrandonGrahamCobb outerObj = new BrandonGrahamCobb();
  	BrandonGrahamCobb.Cobb innerObj = outerObj.new Cobb();
     //innerObj.flashcard();
     innerObj.parsesrc( "BrandonGrahamCobb.java" );
   }
}
