public class Linear_Search {
    public static <T> boolean linearSearch(T[] data, int min, int max, T target)
    {
        int index = min;
        boolean found = false;

        while (!found && index <= max)
        {
            found = data[index].equals(target);
            index++;
        }

        return found;
    }
}
