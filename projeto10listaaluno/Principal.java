/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto10listaaluno;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        //INSTACIAR 10 OBJETOS DA CLASSE ALUNO USANDO O CONSTRUTOR CHEIO
        Aluno aluno01 = new Aluno(101 , "Araci", "1111-1111");
        Aluno aluno02 = new Aluno(102 , "Bianca", "2222-2222");
        Aluno aluno03 = new Aluno(103 , "Carlos", "3333-3333");
        Aluno aluno04 = new Aluno(104 , "Dionisio", "4444-4444");
        Aluno aluno05 = new Aluno(105 , "Ellen", "5555-5555");
        Aluno aluno06 = new Aluno(106 , "Fabricio", "6666-6666");
        Aluno aluno07 = new Aluno(107 , "Gabriel", "7777-7777");
        Aluno aluno08 = new Aluno(108 , "Hannah", "8888-8888");
        Aluno aluno09 = new Aluno(109 , "Igor", "9999-9999");
        Aluno aluno10 = new Aluno(110 , "Jaqueline", "1010-1010");
        
        //Objeto 'listaAlunos' pertence 'a Classe ArrayList
        //instanciando uma lista vazia que só receberá objetos da classe Aluno
        //classe Aluno
        //classe TIPADA ArrayList<T>
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        //ADICIONANDO 10 OBJETOS DA CLASSE Aluno
        //na lista Instaciada usando método add()
        listaAluno.add(aluno01);
        listaAluno.add(aluno02);
        listaAluno.add(aluno03);
        listaAluno.add(aluno04);
        listaAluno.add(aluno05);
        listaAluno.add(aluno06);
        listaAluno.add(aluno07);
        listaAluno.add(aluno08);
        listaAluno.add(aluno09);
        listaAluno.add(aluno10);
        //NAO ACEITA STRING
        for (i = 111; i <= 115; i++){
            Aluno objAluno = new Aluno(i, "Aluno"+i, "12345-5"+i);
            listaAluno.add(objAluno);
        }
        /*Novos objetos definidos fora do FOR
        Teremos referencia a um único objeto (GLOBAL)
        Nesse caso teremos de colocar o objeto dentro do FOR
        Aluno objAluno = new Aluno();
        for (i = 111; i <= 115; i++){
            objAluno.setIdAluno(i);
            objAluno.setNome("Novo aluno"+i);
            objAluno.setCelular("12345-X"+i);
            listaAluno.add(objAluno);
        }*/
        //LEITURA DOS OBJETOS ADICIONADOS DENTRO DA LISTA
        //USANDO O LAÇO FOR
        //Método size() retorna o tamanho da lista
        //Método get(index) retorna o elemento da posição INDEX
        /*for (i = 0; i < listaAluno.size(); i++){
            System.out.println("Aluno"+listaAluno.get(i).getIdAluno()+"-"+
                                       listaAluno.get(i).getNome()+"-"+
                                       listaAluno.get(i).getCelular());
        }*/
        
        //Não devo declarar dentro do laço FOR
        Aluno objAluno1 = new Aluno();
        for (i = 0; i < listaAluno.size(); i++){
            Aluno objAluno = listaAluno.get(i);
            if (objAluno.getIdAluno() == 999){
                System.out.println("Encontrei o "+objAluno.getNome());
            }
            System.out.println("ID: "+objAluno.getIdAluno());
            System.out.println("Nome: "+objAluno.getNome());
            System.out.println("Celular: "+objAluno.getCelular());
        }
    }
}