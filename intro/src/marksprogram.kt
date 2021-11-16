import java.util.*

fun main()
{
    var scan = Scanner(System.`in`)
    println("Enter the size of marks: ")
    var size =  scan.nextInt()
    var marks = Array(size,{0})
    var min = Integer.MAX_VALUE;
    var max = Integer.MIN_VALUE;
    var smin =Integer.MAX_VALUE;
    var smax = Integer.MIN_VALUE;
    var cp=0;
    var cf=0;

    for(i in 0..size-1)
    {
        marks[i] = scan.nextInt()

            if (marks[i] > max) {
                smax = max;
                max = marks[i];
            }

            /* If arr[i] is in between first and
               second then update second  */
            else if (marks[i] > smax && marks[i] != max)
                smax = marks[i];


            if (marks[i] < min) {
                smin = min;
                min = marks[i];
            }

            /* If arr[i] is in between first and
               second then update second  */
            else if (marks[i] < smin && marks[i] != min)
                smin = marks[i];

        if(marks[i]>50)
            cp++;
        else
            cf++;
    }
    for (m in marks)
    {
        if(m>50)
        println("$m pass")
        else
            println("$m fail")
    }
    print("$min $max $smax $smin $cp $cf ")
}