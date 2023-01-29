package src;

public class HexagonalGrid extends Graph{
    public HexagonalGrid(){
        super();
        createHexagonalGrid();
    }

    public void createHexagonalGrid(){
        for(int i = 1; i < 55; i++){
            this.addVertex(i);//creates 54 vertices
        }

        //adds all the ages in the way where it will create a hexagonal grid just like in the game
        this.addEdge(1, 4);
        this.addEdge(1, 5);

        this.addEdge(2, 5);
        this.addEdge(2, 6);

        this.addEdge(3, 6);
        this.addEdge(3, 7);

        this.addEdge(4, 8);
        //this.addEdge(4, 1);

        //this.addEdge(5, 1);
        //this.addEdge(5, 2);
        this.addEdge(5, 9);

        //this.addEdge(6, 2);
        //this.addEdge(6, 3);
        this.addEdge(6, 10);

        //this.addEdge(7, 3);
        this.addEdge(7, 11);

        //this.addEdge(8, 4);
        this.addEdge(8, 12);
        this.addEdge(8, 13);

        //this.addEdge(9, 5);
        this.addEdge(9, 13);
        this.addEdge(9, 14);

        //this.addEdge(10, 6);
        this.addEdge(10, 14);
        this.addEdge(10, 15);

        //this.addEdge(11, 7);
        this.addEdge(11, 15);
        this.addEdge(11, 16);

        //this.addEdge(12, 8);
        this.addEdge(12, 17);

        //this.addEdge(13, 8);
        //this.addEdge(13, 9);
        this.addEdge(13, 18);

        //this.addEdge(14, 9);
        //this.addEdge(14, 10);
        this.addEdge(14, 19);

        //this.addEdge(15, 10);
        //this.addEdge(15, 11);
        this.addEdge(15, 20);

        //this.addEdge(16, 11);
        this.addEdge(16, 21);

        //this.addEdge(17, 12);
        this.addEdge(17, 22);
        this.addEdge(17, 23);

        //this.addEdge(18, 13);
        this.addEdge(18, 23);
        this.addEdge(18, 24);


        //this.addEdge(19, 14);
        this.addEdge(19, 24);
        this.addEdge(19, 25);

        //this.addEdge(20, 15);
        this.addEdge(20, 25);
        this.addEdge(20, 26);

        //this.addEdge(21, 16);
        this.addEdge(21, 26);
        this.addEdge(21, 27);

        //this.addEdge(22, 17);
        this.addEdge(22, 28);

        //this.addEdge(23, 17);
        //this.addEdge(23, 18);
        this.addEdge(23, 29);

        //this.addEdge(24, 18);
        //this.addEdge(24, 19);
        this.addEdge(24, 30);

        //this.addEdge(25, 19);
        //this.addEdge(25, 20);
        this.addEdge(25, 31);

        //this.addEdge(26, 20);
        //this.addEdge(26, 21);
        this.addEdge(26, 32);

        //this.addEdge(27, 21);
        this.addEdge(27, 33);


        //this.addEdge(28, 22);
        this.addEdge(28, 34);

        //this.addEdge(29, 23);
        this.addEdge(29, 34);
        this.addEdge(29, 35);

        //this.addEdge(30, 24);
        this.addEdge(30, 35);
        this.addEdge(30, 36);

        //this.addEdge(31, 25);
        this.addEdge(31, 36);
        this.addEdge(31, 37);

        //this.addEdge(32, 26);
        this.addEdge(32, 37);
        this.addEdge(32, 38);

        //this.addEdge(33, 27);
        this.addEdge(33, 38);

        //this.addEdge(34, 28);
        //this.addEdge(34, 29);
        this.addEdge(34, 39);

        //this.addEdge(35, 29);
        //this.addEdge(35, 30);
        this.addEdge(35, 40);

        //this.addEdge(36, 30);
        //this.addEdge(36, 31);
        this.addEdge(36, 41);

        //this.addEdge(37, 31);
        //this.addEdge(37, 32);
        this.addEdge(37, 42);

        //this.addEdge(38, 32);
        //this.addEdge(38, 33);
        this.addEdge(38, 43);

        //this.addEdge(39, 34);
        this.addEdge(39, 44);

        //this.addEdge(40, 35);
        this.addEdge(40, 44);
        this.addEdge(40, 45);

        //this.addEdge(41, 36);
        this.addEdge(41, 45);
        this.addEdge(41, 46);

        //this.addEdge(42, 37);
        this.addEdge(42, 46);
        this.addEdge(42, 47);

        //this.addEdge(43, 38);
        this.addEdge(43, 47);

        //this.addEdge(44, 39);
        //this.addEdge(44, 40);
        this.addEdge(44, 48);

        //this.addEdge(45, 40);
        //this.addEdge(45, 41);
        this.addEdge(45, 49);

        //this.addEdge(46, 41);
        //this.addEdge(46, 42);
        this.addEdge(46, 50);

        //this.addEdge(47, 42);
        //this.addEdge(47, 43);
        this.addEdge(47, 51);

        //this.addEdge(48, 44);
        this.addEdge(48, 52);

        //this.addEdge(49, 45);
        this.addEdge(49, 52);
        this.addEdge(49, 53);

        //this.addEdge(50, 46);
        this.addEdge(50, 53);
        this.addEdge(50, 54);

        //this.addEdge(51, 47);
        this.addEdge(51, 54);

        //this.addEdge(52, 48);
        //this.addEdge(52, 49);

        //this.addEdge(53, 49);
        //this.addEdge(53, 50);

        //this.addEdge(54, 50);
        //this.addEdge(54, 51);

    }
}
