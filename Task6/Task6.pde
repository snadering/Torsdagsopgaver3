//6.a
int[][] board = new int[8][8];


void setup(){
  fullScreen();
  background(100);
  //6.b
  int count = 0;
  for(int i = 0; i < board.length; i++){
    for(int n = 0; n < board[i].length; n++){
      if(count % 2==0){
      board[i][n] = 0;
      }
      else{
      board[n][i] = 1;
      }
      count++;
    }
    count++;
  }
  
  
}
void draw(){
  int sideLength = 40;
  //6.c
  for(int i = 0; i < board.length; i++){
    for(int n = 0; n < board.length; n++){
      //6.d
      if(board[i][n] == 0){
      fill(0);
      }else{
      fill(255);
      }
      rect(i*sideLength,n*sideLength, sideLength, sideLength);
    }
  }
}
