public class GetShortestPath {
    public static float getshortpath(String Path) {
        int x = 0, y = 0;
        for (int i = 0; i < Path.length(); i++) {
            char dir = Path.charAt(i);
            if (dir == 's') {
                y--;
            } else if (dir == 'n') {
                y++;
            } else if (dir == 'e') {
                x++;
            } else if (dir == 'w') {
                x--;
            }
           
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);

    }

    public static void main(String[] args) {
        String Path = "nnneeee";
   System.out.println(getshortpath(Path));
    }
}
