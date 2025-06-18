# Simulador de Mobilidade Urbana - Morada do Sol, Teresina, PI

## 📋 Descrição do Projeto

Este projeto apresenta um simulador de mobilidade urbana que modela a rede viária do bairro **Morada do Sol** em **Teresina, Piauí** como um grafo, onde os nós representam interseções e as arestas representam ruas reais do bairro. O sistema gera veículos de forma aleatória com origem e destino definidos, calculando rotas mínimas por meio do algoritmo de Dijkstra. O controle dos semáforos é realizado por heurísticas adaptativas que otimizam o fluxo de veículos e o consumo energético.

### 🎯 Características Principais

- **Rede Real**: Utiliza dados reais das ruas do bairro Morada do Sol, Teresina, PI
- **Simulação Realística**: Modela veículos, semáforos e fluxo de tráfego
- **Algoritmos Próprios**: Implementa estruturas de dados personalizadas (filas, listas, grafos)
- **Heurísticas Adaptativas**: Três modelos diferentes de controle de semáforos
- **Relatórios Detalhados**: Gera estatísticas completas da simulação

---

## 🖥️ Requisitos do Sistema

### Software Necessário
- **Java Development Kit (JDK)** versão 8 ou superior
- **Sistema Operacional**: Windows, Linux ou macOS
- **Memória RAM**: Mínimo 512MB disponível
- **Espaço em Disco**: 50MB livres

### Dependências Incluídas
- `json-20240303.jar` - Biblioteca para processamento de arquivos JSON (já incluída na pasta `lib/`)

---

## 📁 Estrutura do Projeto

```
Simulador_Mobilidade_Urbana-main/
├── src/                          # Código fonte
│   ├── Main.java                 # Classe principal
│   ├── cidade/                   # Classes da cidade e grafo
│   ├── estruturas/               # Estruturas de dados personalizadas
│   ├── heuristica/               # Algoritmos de controle de semáforos
│   ├── json/                     # Processamento de dados JSON
│   │   └── Morada_do_Sol.json    # Dados das ruas do Morada do Sol
│   ├── semaforo/                 # Sistema de semáforos
│   └── trafego/                  # Geração e controle de veículos
├── lib/                          # Bibliotecas externas
│   └── json-20240303.jar         # Biblioteca JSON
├── bin/                          # Arquivos compilados (criado automaticamente)
└── README.md                     # Este arquivo
```

---

## 🚀 Como Compilar e Executar

### Método 1: Linha de Comando (Recomendado)

#### 1. Navegue até o diretório do projeto
```bash
cd ~/workspace/Simulador_Mobilidade_Urbana-main
```

#### 2. Compile o projeto
```bash
javac -cp "lib/*:src" -d bin $(find src -name "*.java")
```

#### 3. Execute o simulador
```bash
java -cp "lib/*:bin:src" Main
```

#### 4. Execute com duração personalizada (opcional)
```bash
java -cp "lib/*:bin:src" Main 30
```
*Onde 30 é a duração da simulação em unidades de tempo*

### Método 2: IntelliJ IDEA

#### 1. Abrir o Projeto
- Abra o IntelliJ IDEA
- Selecione "Open" e navegue até a pasta `Simulador_Mobilidade_Urbana-main`
- Aguarde o IntelliJ indexar o projeto

#### 2. Configurar as Bibliotecas
- Clique com botão direito na pasta `lib`
- Selecione "Add as Library..."
- Confirme a adição da biblioteca
- Clique em "OK"

#### 3. Executar o Programa
- Navegue até `src/Main.java`
- Clique no botão "Run" (▶️) ao lado da classe `Main`
- Ou use o atalho `Shift + F10` (Windows/Linux) ou `Control + R` (Mac)

---

## 📊 Exemplo de Saída

### Inicialização
```
Carregando grafo do arquivo JSON...
Número de vértices carregados: 1922

Configurando simulador...
- Duração: 20 unidades de tempo
- Máximo de veículos: 7
- Heurística: Ciclo Fixo

Iniciando simulação...
```

### Durante a Simulação
```
== Passo 0 ==
Veículo #1: Iniciou trajeto (Origem: Rua Crisântemos -> Destino: Rua Crisântemos)
Veículo #1: Avançou para Rua Aristides Saraiva de Almeida
Semáforo Rua Leôncio Ferraz: VERDE (5s)
Semáforo Rua Treze: VERDE (5s)
Semáforo Rua Carlos Fortes de Pádua: VERDE (5s)

== Passo 1 ==
Veículo #2: Iniciou trajeto (Origem: Rua Leonardo Castelo Branco -> Destino: Rua Leonardo Castelo Branco)
Veículo #1: Avançou para Rua Assis Veloso
Veículo #2: Avançou para Rua Deputado José Lourenço Mourão
Semáforo Rua Leôncio Ferraz: VERDE (5s)
Semáforo Rua Treze: VERDE (5s)
Semáforo Rua Carlos Fortes de Pádua: VERDE (5s)
```

### Estatísticas Finais
```
Simulação finalizada.
Total de veículos gerados: 7
Veículos que completaram o trajeto: 1
Tempo médio de viagem: -1.0 unidades
Tempo médio de espera: 9.5 unidades
Índice de congestionamento: 0.86
```

### 📈 Explicação da Saída

**Inicialização:**
- Carrega o grafo com as ruas reais do Morada do Sol (1922 vértices)
- Configura parâmetros da simulação
- Inicializa o sistema de semáforos

**Durante a Simulação:**
- `== Passo X ==`: Indica o momento atual da simulação
- `Veículo #N: Iniciou trajeto`: Novo veículo gerado com origem e destino
- `Veículo #N: Avançou para [Rua]`: Movimento do veículo pelas ruas reais
- `Semáforo [Rua]: [Estado]`: Estado atual dos semáforos (VERDE, AMARELO, VERMELHO)

**Estatísticas Finais:**
- `Total de veículos gerados`: Quantidade total de veículos criados
- `Veículos que completaram o trajeto`: Veículos que chegaram ao destino
- `Tempo médio de viagem`: Tempo médio para completar um trajeto
- `Tempo médio de espera`: Tempo médio de espera em semáforos
- `Índice de congestionamento`: Métrica de congestionamento (0.0 a 1.0)

---

## 🏙️ Sobre as Ruas do Morada do Sol

O simulador utiliza dados reais das ruas do bairro **Morada do Sol** em **Teresina, Piauí**, incluindo:

### Principais Ruas Modeladas
- Rua Leôncio Ferraz
- Rua Treze
- Rua Carlos Fortes de Pádua
- Rua Crisântemos
- Rua Leonardo Castelo Branco
- Rua Aristides Saraiva de Almeida
- Rua Assis Veloso
- Rua César Leal
- Rua Deputado José Lourenço Mourão
- Rua Mundinho Ferraz
- Rua Cravos
- Rua Dezessete
- E muitas outras...

### Características da Modelagem
- **1922 interseções** mapeadas
- **Conexões reais** entre as ruas
- **Semáforos estratégicos** em pontos de maior fluxo
- **Dados geográficos** baseados em OpenStreetMap

---

## 🔧 Configurações Avançadas

### Parâmetros Modificáveis no Código

**Duração da Simulação:**
```java
int duracaoSimulacao = 20; // Altere este valor em Main.java
```

**Máximo de Veículos:**
```java
int maxVeiculos = 7; // Configurável no simulador
```

**Heurísticas Disponíveis:**
1. **Ciclo Fixo**: Tempos fixos para todos os semáforos
2. **Otimização do Tempo de Espera**: Ajusta baseado no tamanho das filas
3. **Modelo Adaptativo**: Responde dinamicamente ao fluxo

---

## 🛠️ Resolução de Problemas (Troubleshooting)

### Erro: "class JSONException not found"
**Solução:**
```bash
# Verifique se a biblioteca está no classpath
ls -la lib/json-20240303.jar

# Recompile com o classpath correto
javac -cp "lib/*:src" -d bin $(find src -name "*.java")
```

### Erro: "Arquivo JSON não encontrado"
**Solução:**
```bash
# Verifique se o arquivo existe
ls -la src/json/Morada_do_Sol.json

# Execute com o classpath incluindo src
java -cp "lib/*:bin:src" Main
```

### Erro: "JAVA_HOME not set"
**Solução:**
```bash
# Linux/Mac
export JAVA_HOME=/path/to/your/jdk
export PATH=$JAVA_HOME/bin:$PATH

# Windows
set JAVA_HOME=C:\path\to\your\jdk
set PATH=%JAVA_HOME%\bin;%PATH%
```

### Erro: "OutOfMemoryError"
**Solução:**
```bash
# Execute com mais memória
java -Xmx1024m -cp "lib/*:bin:src" Main
```

### Erro: "Encoding problems" (caracteres especiais)
**Solução:**
```bash
# Execute com encoding UTF-8
java -Dfile.encoding=UTF-8 -cp "lib/*:bin:src" Main
```

### Problemas de Compilação
**Soluções:**
1. Verifique a versão do Java: `java -version`
2. Limpe arquivos compilados: `rm -rf bin/*`
3. Recompile do zero seguindo os passos acima
4. Verifique permissões dos arquivos: `chmod +r lib/*.jar`

---

## 🔍 Estruturas de Dados Implementadas

O projeto implementa suas próprias estruturas de dados sem usar as coleções padrão do Java:

### Lista Ligada
```java
public class ArrayList1<T> {
    private No<T> primeiro;
    private int tamanho;
    
    public void adicionar(T elemento) { /* implementação */ }
    public T obter(int indice) { /* implementação */ }
    public boolean remover(T elemento) { /* implementação */ }
}
```

### Fila (Queue)
```java
public class Fila<T> {
    private No<T> inicio;
    private No<T> fim;
    
    public void enqueue(T elemento) { /* implementação */ }
    public T dequeue() { /* implementação */ }
    public boolean estaVazia() { /* implementação */ }
}
```

### Algoritmo de Dijkstra
- Implementação própria para cálculo de caminhos mínimos
- Otimizado para a rede viária do Morada do Sol
- Considera pesos das arestas (distâncias reais)

---

## 📈 Heurísticas de Controle de Semáforos

### 1. Modelo de Ciclo Fixo
- Tempos predefinidos para cada estado
- Verde: 30 segundos
- Amarelo: 5 segundos  
- Vermelho: 30 segundos
- Não se adapta ao fluxo de veículos

### 2. Otimização do Tempo de Espera
- Ajusta dinamicamente os tempos de verde
- Considera o tamanho das filas de veículos
- Semáforo com maior fila recebe mais tempo verde
- Reduz tempo médio de espera

### 3. Modelo Adaptativo (Futuro)
- Aprendizado baseado em padrões históricos
- Otimização em tempo real
- Consideração de múltiplos fatores

---

## 🚀 Melhorias Futuras

- **Interface Gráfica**: Visualização em tempo real do tráfego
- **Múltiplos Tipos de Veículos**: Ônibus, emergências, bicicletas
- **Eventos Inesperados**: Acidentes, obras, condições climáticas
- **Exportação de Dados**: CSV, JSON para análise externa
- **Integração com APIs**: Dados de tráfego em tempo real
- **Machine Learning**: Controle adaptativo inteligente
- **Simulação em Larga Escala**: Toda a cidade de Teresina

---

## 📝 Notas Importantes

1. **Dados Reais**: O simulador usa dados reais do bairro Morada do Sol
2. **Aleatoriedade**: Cada execução produz resultados diferentes
3. **Performance**: Otimizado para simulações de até 50 veículos simultâneos
4. **Extensibilidade**: Código modular permite fácil adição de funcionalidades
5. **Educacional**: Ideal para estudos de algoritmos e estruturas de dados

---

## 📞 Suporte

Para problemas ou dúvidas:
1. Verifique a seção de **Troubleshooting** acima
2. Confirme que todos os **Requisitos do Sistema** estão atendidos
3. Teste com os **comandos exatos** fornecidos nesta documentação
4. Verifique se os **arquivos necessários** estão presentes

---

*Simulador desenvolvido para estudos de mobilidade urbana e otimização de tráfego no bairro Morada do Sol, Teresina, PI.*