package Ro;

import ilog.concert.*;
import ilog.cplex.*;
public class tp2 {
	
	
	
public static void main(String[] args) {
calcul ();
}
public static void calcul (){
try {
IloCplex simplexe = new IloCplex ();
// déclaration des Variables de décision de type ENTIER
IloNumVar var_decis [][] = new IloNumVar [19][1];

for (int i=0;i<19;i++){
 var_decis[i][0]= simplexe.numVar(0, Integer.MAX_VALUE);
}





// declaration de la fonction objectif
IloLinearNumExpr objectif = simplexe.linearNumExpr();
// Définition des coefficients de la fonction objectif
objectif.addTerm(1, var_decis[18][0]);

// Définir le type d'otimisation de la fonction (max ou min )
simplexe.addMinimize(objectif);
// contrainte 1 : T1=0
IloLinearNumExpr contrainte_1 = simplexe.linearNumExpr();
contrainte_1.addTerm(1, var_decis[0][0]);
simplexe.addLe(contrainte_1, 0);
// la meme chose pour les autres contraintes
//deuxième contrainte t1-t2<=-2
IloLinearNumExpr contrainte_2 = simplexe.linearNumExpr();
contrainte_2.addTerm(1, var_decis[0][0]);
contrainte_2.addTerm(-1, var_decis[1][0]);
simplexe.addLe(contrainte_2, -2);
//troisième contrainte t2-t3<=-16
IloLinearNumExpr contrainte_3 = simplexe.linearNumExpr();
contrainte_3.addTerm(1, var_decis[1][0]);
contrainte_3.addTerm(-1, var_decis[2][0]);
simplexe.addLe(contrainte_3, -16);
//4eme contrainte t2-t4<=-16
IloLinearNumExpr contrainte_4 = simplexe.linearNumExpr();
contrainte_4.addTerm(1, var_decis[1][0]);
contrainte_4.addTerm(-1, var_decis[3][0]);
simplexe.addLe(contrainte_4, -16);
//5eme contrainte t2-t14<=-16
IloLinearNumExpr contrainte_5 = simplexe.linearNumExpr();
contrainte_5.addTerm(1, var_decis[1][0]);
contrainte_5.addTerm(-1, var_decis[13][0]);
simplexe.addLe(contrainte_5, -16);

//6eme contrainte t3-t5<=-9
IloLinearNumExpr contrainte_6 = simplexe.linearNumExpr();
contrainte_6.addTerm(1, var_decis[2][0]);
contrainte_6.addTerm(-1, var_decis[4][0]);
simplexe.addLe(contrainte_6, -9);
//7eme contrainte t4-t6<=-8
IloLinearNumExpr contrainte_7 = simplexe.linearNumExpr();
contrainte_7.addTerm(1, var_decis[3][0]);
contrainte_7.addTerm(-1, var_decis[5][0]);
simplexe.addLe(contrainte_7, -8);
//8eme contrainte t4-t7<=-8
IloLinearNumExpr contrainte_8 = simplexe.linearNumExpr();
contrainte_8.addTerm(1, var_decis[3][0]);
contrainte_8.addTerm(-1, var_decis[6][0]);
simplexe.addLe(contrainte_8, -8);
//9eme contrainte t4-t9<=-8
IloLinearNumExpr contrainte_9 = simplexe.linearNumExpr();
contrainte_9.addTerm(1, var_decis[3][0]);
contrainte_9.addTerm(-1, var_decis[8][0]);
simplexe.addLe(contrainte_9, -8);
//10eme contrainte t4-t15<=-8
IloLinearNumExpr contrainte_10 = simplexe.linearNumExpr();
contrainte_10.addTerm(1, var_decis[3][0]);
contrainte_10.addTerm(-1, var_decis[14][0]);
simplexe.addLe(contrainte_10, -8);
//11eme contrainte t4-t10<=-8
IloLinearNumExpr contrainte_11 = simplexe.linearNumExpr();
contrainte_11.addTerm(1, var_decis[3][0]);
contrainte_11.addTerm(-1, var_decis[9][0]);
simplexe.addLe(contrainte_11, -8);
//12eme contrainte t5-t6<=-10
IloLinearNumExpr contrainte_12 = simplexe.linearNumExpr();
contrainte_12.addTerm(1, var_decis[4][0]);
contrainte_12.addTerm(-1, var_decis[5][0]);
simplexe.addLe(contrainte_12, -10);

//13eme contrainte t6-t8<=-6
IloLinearNumExpr contrainte_13 = simplexe.linearNumExpr();
contrainte_13.addTerm(1, var_decis[5][0]);
contrainte_13.addTerm(-1, var_decis[7][0]);
simplexe.addLe(contrainte_13, -6);
//14eme contrainte t6-t9<=-6
IloLinearNumExpr contrainte_14 = simplexe.linearNumExpr();
contrainte_14.addTerm(1, var_decis[5][0]);
contrainte_14.addTerm(-1, var_decis[8][0]);
simplexe.addLe(contrainte_14, -6);
//15eme contrainte t6-t11<=-6
IloLinearNumExpr contrainte_15 = simplexe.linearNumExpr();
contrainte_15.addTerm(1, var_decis[5][0]);
contrainte_15.addTerm(-1, var_decis[10][0]);
simplexe.addLe(contrainte_15, -6);

//16eme contrainte t7-t13<=-2
IloLinearNumExpr contrainte_16 = simplexe.linearNumExpr();
contrainte_16.addTerm(1, var_decis[6][0]);
contrainte_16.addTerm(-1, var_decis[12][0]);
simplexe.addLe(contrainte_16, -2);
//17eme contrainte t8-t16<=-2
IloLinearNumExpr contrainte_17 = simplexe.linearNumExpr();
contrainte_17.addTerm(1, var_decis[7][0]);
contrainte_17.addTerm(-1, var_decis[15][0]);
simplexe.addLe(contrainte_17, -2);
//18eme contrainte t9-t12<=-9
IloLinearNumExpr contrainte_18 = simplexe.linearNumExpr();
contrainte_18.addTerm(1, var_decis[8][0]);
contrainte_18.addTerm(-1, var_decis[11][0]);
simplexe.addLe(contrainte_18, -9);

//19eme contrainte t10-t19<=-5
IloLinearNumExpr contrainte_19 = simplexe.linearNumExpr();
contrainte_19.addTerm(1, var_decis[9][0]);
contrainte_19.addTerm(-1, var_decis[18][0]);
simplexe.addLe(contrainte_19, -5);
//20eme contrainte t11-t16<=-3
IloLinearNumExpr contrainte_20 = simplexe.linearNumExpr();
contrainte_20.addTerm(1, var_decis[10][0]);
contrainte_20.addTerm(-1, var_decis[15][0]);
simplexe.addLe(contrainte_20, -3);
//21eme contrainte t12-t17<=-2
IloLinearNumExpr contrainte_21 = simplexe.linearNumExpr();
contrainte_21.addTerm(1, var_decis[11][0]);
contrainte_21.addTerm(-1, var_decis[16][0]);
simplexe.addLe(contrainte_21, -2);

//22eme contrainte t13-t19<=-1
IloLinearNumExpr contrainte_22 = simplexe.linearNumExpr();
contrainte_22.addTerm(1, var_decis[12][0]);
contrainte_22.addTerm(-1, var_decis[18][0]);
simplexe.addLe(contrainte_22, -1);
//23eme contrainte t14-t15<=-7
IloLinearNumExpr contrainte_23 = simplexe.linearNumExpr();
contrainte_23.addTerm(1, var_decis[13][0]);
contrainte_23.addTerm(-1, var_decis[14][0]);
simplexe.addLe(contrainte_23, -7);
//24eme contrainte t14-t16<=-7
IloLinearNumExpr contrainte_24 = simplexe.linearNumExpr();
contrainte_24.addTerm(1, var_decis[13][0]);
contrainte_24.addTerm(-1, var_decis[15][0]);
simplexe.addLe(contrainte_24, -7);
//25eme contrainte t15-t19<=-4
IloLinearNumExpr contrainte_25 = simplexe.linearNumExpr();
contrainte_25.addTerm(1, var_decis[14][0]);
contrainte_25.addTerm(-1, var_decis[18][0]);
simplexe.addLe(contrainte_25, -4);
//26eme contrainte t16-t19<=-3
IloLinearNumExpr contrainte_26 = simplexe.linearNumExpr();
contrainte_26.addTerm(1, var_decis[15][0]);
contrainte_26.addTerm(-1, var_decis[18][0]);
simplexe.addLe(contrainte_26, -3);
//26eme contrainte t17-t18<=-9
IloLinearNumExpr contrainte_27 = simplexe.linearNumExpr();
contrainte_27.addTerm(1, var_decis[16][0]);
contrainte_27.addTerm(-1, var_decis[17][0]);
simplexe.addLe(contrainte_27, -9);
//27eme contrainte t18-t19<=-1
IloLinearNumExpr contrainte_28 = simplexe.linearNumExpr();
contrainte_28.addTerm(1, var_decis[17][0]);
contrainte_28.addTerm(-1, var_decis[18][0]);
simplexe.addLe(contrainte_28, -1);

simplexe.solve(); // lancer la resolution
// Afficher des résultat
System.out.println("Voici la valeur de la fonction objectif "+ simplexe.getObjValue());
System.out.println(" Voici les valeurs des variables de décision: ") ;
for (int i=0;i<19;i++)
System.out.println( "T"+(i+1)+ " = "+ simplexe.getValue(var_decis[i][0]));
} catch (IloException e){
System.out.print("Exception levée " + e);
}
}
}