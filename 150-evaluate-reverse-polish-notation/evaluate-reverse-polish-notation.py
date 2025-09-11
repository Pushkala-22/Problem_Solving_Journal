class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        s=[]
        for i in tokens:
            if i not in "+-*/":
                s.append(int(i))
            else:
                l=s.pop()
                f=s.pop()
                if i=="+":
                    s.append(f+l)
                    
                elif i=="-":
                    s.append(f-l)
                    
                elif i=="*":
                    s.append(f*l)
                    
                else:
                    s.append((int)(f/l))
                    
        return s[0]
                     
                
        
        