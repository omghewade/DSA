public class Direction {
 
    
    public static float shortPath(String Dir)

    {
         int x=0;
         int y=0;
     
         for(int i=0; i< Dir.length();i++)
         {
            if(Dir.charAt(i)=='E')
            {
                x++;
            }
            else if(Dir.charAt(i)=='W')
            {
                x--;
            }

            else if(Dir.charAt(i)=='N')
            {
                y++;
            }

            else if(Dir.charAt(i)=='S')
            {
                y--;
            }
         }
         float a = x*x;
         float b= y*y;
         return (float) Math.sqrt(a + b);

    }




    public static void main(String[] args) {
        
        System.out.println(shortPath("WNEENESENNN"));
    }
}
