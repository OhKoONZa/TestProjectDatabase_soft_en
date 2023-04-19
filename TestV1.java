class TestV1{
    static TestV1 v = new TestV1();
    char[][] maze = new char[10][10];
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println("wut create file2");
        kuy();
        v.start();
        v.print();
    }

    public static void kuy() {
        System.out.println("hello wut");
    }

    public void start(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                maze[i][j] = ' ';
            }
        }

        for(int i=0;i<10;i++){
            maze[0][i] = '#';
            maze[9][i] = '#';
            maze[i][0] = '#';
            maze[i][9] = '#';
        }
    }

    public void print(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(maze[i][j]);
            }
            System.out.println("");
        }
    }
}