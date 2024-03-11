package strategy;

public enum Trans {
    monday {
        public String day() {
            return "월요일";
        }
    },

    tuesday {
        @Override
        public String day (){
            return "화요일";
        }
    }

    ,

    wednesday {
        @Override
        public String day (){
            return "수요일";
        }
    },

    thursday {
        @Override
        public String day (){
            return "목요일";
        }
    },

    friday {
        @Override
        public String day (){
            return "금요일";
        }
    },

    saturday {
        @Override
        public String day (){
            return "토요일";
        }
    },

    sunday {
        @Override
        public String day (){
            return "일요일";
        }
    };

    public abstract String day();
}
