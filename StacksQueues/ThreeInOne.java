package ctci.StacksQueues;

/**
 * Created by sanjanabadam on 2/3/17.
 */
public class ThreeInOne {
    public static void main(String[] args) {
        singleArray sa = new singleArray();
        sa.push(0,10);
        //System.out.println(sa.peek(0));
        sa.push(0,20);
        //System.out.println(sa.peek(0));
        sa.push(0,30);
        System.out.println(sa.pop(0));
        System.out.println(sa.peek(0));
        //sa.push(-1,10);
        //sa.push(11,10);
        sa.push(1, 40);
        System.out.println(sa.peek(0));
        System.out.println(sa.peek(1));
        System.out.println(sa.pop(1));
        System.out.println(sa.peek(1));
        System.out.println(sa.peek(2));
        //System.out.println(sa.peek(3));
        //System.out.println(sa.peek(-1));



    }
    public static class singleArray{
        int num_stacks = 3;
        int stack_size = 30;
        int[] array = new int[num_stacks*stack_size];
        int[] stack_pointers = new int[num_stacks];

        singleArray(){
            for(int i = 0; i < num_stacks; i++){
                stack_pointers[i] = -1;
            }
        }

        public void push(int stack_num, int data){
            if(stack_num < 0 || stack_num > num_stacks-1){
                System.out.println("Invalid stack number. Please try again.");
                return;
            }
            if(stack_pointers[stack_num]>stack_size){
                System.out.println("This stack is full. Please try again.");
                return;
            }
            array[stack_pointers[stack_num]+1+(stack_num*stack_size)] = data;
            stack_pointers[stack_num] = stack_pointers[stack_num]+1+(stack_num*stack_size);
        }

        public int pop(int stack_num){
            if(stack_num < 0 || stack_num > num_stacks-1){
                System.out.println("Invalid stack number. Please try again.");
                return -1;
            }
            if(stack_pointers[stack_num] == -1 || stack_pointers[stack_num] < stack_num*stack_size){
                System.out.println("Stack is empty. Please try again.");
                return -1;
            }

            int val = array[stack_pointers[stack_num]];
            stack_pointers[stack_num] = stack_pointers[stack_num]-1;
            return val;
        }

        public boolean isEmpty(int stack_num){
            if(stack_num < 0 || stack_num > num_stacks-1){
                System.out.println("Invalid stack number. Please try again.");
                return false;
            }
            if(stack_pointers[stack_num] == -1){
                return true;
            }
            return false;
        }

        public int peek(int stack_num){
            if(stack_num < 0 || stack_num > num_stacks-1){
                System.out.println("Invalid stack number. Please try again.");
                return -1;
            }
            if(stack_pointers[stack_num] == -1 || stack_pointers[stack_num] < stack_num*stack_size){
                System.out.println("Stack is empty. Please try again.");
                return -1;
            }
            //System.out.println("stack_pointers[stack_num]+(stack_size*stack_num) = "+(stack_pointers[stack_num]));
            //System.out.println("array[stack_pointers[stack_num]+(stack_size*stack_num)] = "+array[stack_pointers[stack_num]+(stack_size*stack_num)]);
            return array[stack_pointers[stack_num]];
        }

    }
}
