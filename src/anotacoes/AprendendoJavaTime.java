package anotacoes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AprendendoJavaTime {
    public static void main(String[] args) {

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("Zulu"));
        DateTimeFormatter formato4 = DateTimeFormatter.ISO_DATE_TIME; // formato ISO pronto pra data-hora local
        DateTimeFormatter formato5 = DateTimeFormatter.ISO_INSTANT; // formato ISO pronto para instant

        LocalDate dataAgora = LocalDate.now();
        LocalTime horaAgora = LocalTime.now();
        LocalDateTime dataHoraAgora = LocalDateTime.now(); // data e hora sem fuso
        Instant instante = Instant.parse("2026-02-13T20:30:25Z"); // data e hora com fuso (confuso... kkj)

        LocalDateTime dataLocalizadaAqui = LocalDateTime.ofInstant(instante, ZoneId.systemDefault());
        LocalDateTime dataLocalizadaJapao = LocalDateTime.ofInstant(instante, ZoneId.of("Japan"));
        LocalDateTime aniversario = LocalDateTime.parse("23/01/2003 11:30:00", formato2);
        LocalDate aniversarioData = LocalDate.parse("23/01/2003", formato1);

        Duration duration1 = Duration.between(aniversario, dataHoraAgora);// serve para mensurar a duração entre duas data-horas, com tempo EXATO
        Period idadeCompleta = Period.between(aniversarioData, dataAgora);

        System.out.println("##################################################");
        System.out.println("BÁSICO");
        System.out.println(dataAgora.format(formato1));
        System.out.println(horaAgora);
        System.out.println(dataHoraAgora.format(formato2));
        System.out.println("eu nasci em " + aniversario.format(formato2));
        System.out.println("Tempo exato decorrido entre meu nascimento até agora: " + duration1.toHours() +
                " Hrs, " + duration1.toMinutesPart() + " Min e " + duration1.toSecondsPart() + " Seg");
        System.out.println("Minha idade completa: " + idadeCompleta.getYears() + " anos, " +
                idadeCompleta.getMonths() + " meses, " + idadeCompleta.getDays() + " dias");
        System.out.println("#########################################################");
        System.out.println("CONVERTENDO GLOBAL/LOCAL  LOCAL/GLOBAL");
        System.out.println("Instant global: " + instante);
        System.out.println("Instante global convertido para local (local do sistema): " + dataLocalizadaAqui.format(formato3));
        System.out.println("Instante global convertido para local (Japão): " + dataLocalizadaJapao.format(formato3));
        System.out.println("###################################################################");
        System.out.println("PEGANDO INFORMAÇÔES ISOLADAS");
        System.out.println("Dia no aniversário -> " + aniversario.getDayOfMonth());
        System.out.println("Mês no aniversário -> " + aniversario.getMonth());
        System.out.println("Ano atual -> " + dataHoraAgora.getYear());
        System.out.println("Hora atual no Japão -> " + ZonedDateTime.now(ZoneId.of("JST", ZoneId.SHORT_IDS)).getHour());
        System.out.println("#############################################################################");
        System.out.println("CALCULOS COM DATA-HORA");
        System.out.println("Data-hora atual: " + dataHoraAgora.format(formato2));
        System.out.println(" + 1hr: " + dataHoraAgora.plusHours(1).format(formato2));
        System.out.println(" - 1hr: " + dataHoraAgora.minusHours(1).format(formato2));
        System.out.println("Uma semana depois: " + dataAgora.plusWeeks(1));
        System.out.println("Uma semana antes: " + dataAgora.minusWeeks(1));
        System.out.println("Instant atual: " + formato3.format(Instant.now()));
        System.out.println("Modificando Instant atual: " + formato3.format(Instant.now().minus(3, ChronoUnit.HOURS)));
        System.out.println("Modificando Instant atual: " + formato3.format(Instant.now().plus(7, ChronoUnit.DAYS)));
        // no Instant, .plus() ou .minus() se especifica a unidade de tempo dentro do método usando as constantes ChronoUnit
    }
}
