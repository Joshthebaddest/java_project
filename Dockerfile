FROM openjdk
WORKDIR /app
COPY . /app
RUN javac CalculatorFunctions.java
RUN javac Calculator.java
CMD ["java", "Calculator"] 