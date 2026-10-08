/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
using namespace std;

int main()
{
    int n;
    int matriz[100][100]; 
    
    cout << "=== Matriz Identidade ===" << endl;
    cout << "Digite o tamanho da matriz quadrada (N x N): " << endl;
    cin >> n;
    
    
    if (n <= 0 || n > 100) {
        cout << "Tamanho inválido! Digite um número entre 1 e 100." << endl;
        return 0;
    }
    
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j) {
                matriz[i][j] = 1; 
            } else {
                matriz[i][j] = 0; 
            }
        }
    }
    
    cout << "------------------------------------" << endl;
    cout << "Matriz Resultante " << n << "x" << n << ":" << endl;
    cout << "------------------------------------" << endl;
    
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << matriz[i][j] << " ";
        }
        cout << endl; 
    }

    return 0;
}




