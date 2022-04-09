/*********************************************
 * OPL  Model
 * Author: Y INFO

 *********************************************/
//déclarer un intervalle d'entiers de 1 à nbObjet
range I=1..6;
range J=1..6;

// Déclarer les variables de décisions
dvar boolean x[I][J];

//déclarer des tableaux de données indexés sur les objets
int p[I][J]=[[13,24,31,19,40,29],[18,25,30,15,43,22],[20,20,27,25,34,33],[23,26,28,18,37,30],[28,33,34,17,38,20],[19,36,25,27,45,24]];


// function objectif
maximize sum(i in I)sum(j in J)p[i][j]*x[i][j];

// contraintes
subject to{
sum(i in I)x[i][1]==1;
sum(i in I)x[i][2]==1;
sum(i in I)x[i][3]==1;
sum(i in I)x[i][4]==1;
sum(i in I)x[i][5]==1;
sum(i in I)x[i][6]==1;
sum(j in J)x[1][j]== 1;
sum(j in J)x[2][j]== 1;
sum(j in J)x[3][j]== 1;
sum(j in J)x[4][j]== 1;
sum(j in J)x[5][j]== 1;
sum(j in J)x[6][j]== 1;
}
 