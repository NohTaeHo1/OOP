package strategy;

public enum Operator {
    add{
        @Override
        public int apply(int a, int b){
            return a+b;
        }
    },
    sub{
        @Override
        public int apply(int a, int b){
            return a-b;
        }
    },
    multi{
        @Override
        public int apply(int a, int b){
            return a+b;
        }
    },
    div{
        @Override
        public int apply(int a, int b){
            return a+b;
        }
    };
    public abstract int apply(int a, int b);

}
