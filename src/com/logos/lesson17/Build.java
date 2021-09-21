package com.logos.lesson17;

import lombok.Builder;

public class Build {

    private int var;
    private int var1;
    private int var2;
    private int var3;

    public Builder builder(){
        return new Builder();
    }

    public class Builder{

        Build build = new Build();

        public Builder setVar(int var){
            build.var = var;
            return this;
        }

        public Builder setVar1(int var){
            build.var1 = var;
            return this;
        }

        public Builder setVar2(int var){
            build.var2 = var;
            return this;
        }

        public Builder setVar3(int var){
            build.var3 = var;
            return this;
        }

        public Build build(){
            return build;
        }
    }

}
