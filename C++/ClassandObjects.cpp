

// Write your Student class here
class Student
{
    public:
        int scores[5];
        int count;
        Student()
        {
            count=0;
            for(int i=0;i<5;i++)
                scores[i]=0;
        }
        void input()
        {
            for(int i=0;i<5;i++)
                cin>>scores[i];
            
            
        }
        int calculateTotalScore()
        {
            int sum=0;
            for(int i=0;i<5;i++)
            {    
                sum+=scores[i];
                
            }
            return sum;
        }
};

