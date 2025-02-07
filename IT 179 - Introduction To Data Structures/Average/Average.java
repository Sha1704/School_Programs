public class Average{
    public static void main (String [] args)
    {
        if (args.length == 0)
        {
            System.out.println ("no arguments provided");
        }

        int sum, count = 0;

        for (int i  = 0; i <args.length; i++)
        {
            try
            {
                int num = Integer.parseInt(args[i]);
                sum += num;
                count++;
            }
            catch (NumberFormatException e)
            {
                System.out.println ("Error :" + args[i] + "is not a valid number");
            }
        }

        if (count > 0)
        {
            double avg = (double) sum/count;
            System.out.println("Average: " + avg);
        }
        else
        {
            System.out.println("No valid integer provided");
        }

    } 
}