FROM openjdk
WORKDIR /app
COPY . /app
RUN javac coinExchange.java
CMD ["java","coinExchange"]