package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Method	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
SimpleDateFormat	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Date	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
TimeZone	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Layout	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Level	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
.	TokenNameDOT
LoggingEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
PatternParserTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
"org.foobar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
PatternParserTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
event	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LoggingEvent	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.log4j.Logger"	TokenNameStringLiteral
,	TokenNameCOMMA
logger	TokenNameIdentifier
,	TokenNameCOMMA
Level	TokenNameIdentifier
.	TokenNameDOT
INFO	TokenNameIdentifier
,	TokenNameCOMMA
"msg 1"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
convert	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
pattern	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
registry	TokenNameIdentifier
,	TokenNameCOMMA
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
converters	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
fields	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PatternParser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
pattern	TokenNameIdentifier
,	TokenNameCOMMA
converters	TokenNameIdentifier
,	TokenNameCOMMA
fields	TokenNameIdentifier
,	TokenNameCOMMA
registry	TokenNameIdentifier
,	TokenNameCOMMA
PatternParser	TokenNameIdentifier
.	TokenNameDOT
getPatternLayoutRules	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
converters	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
fields	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
converterIter	TokenNameIdentifier
=	TokenNameEQUAL
converters	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
fieldIter	TokenNameIdentifier
=	TokenNameEQUAL
fields	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
converterIter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
fieldStart	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
PatternConverter	TokenNameIdentifier
)	TokenNameRPAREN
converterIter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
,	TokenNameCOMMA
buf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
FormattingInfo	TokenNameIdentifier
)	TokenNameRPAREN
fieldIter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
fieldStart	TokenNameIdentifier
,	TokenNameCOMMA
buf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNewWord	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
HashMap	TokenNameIdentifier
ruleRegistry	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ruleRegistry	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"z343"	TokenNameStringLiteral
,	TokenNameCOMMA
Num343PatternConverter	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
"%z343"	TokenNameStringLiteral
,	TokenNameCOMMA
ruleRegistry	TokenNameIdentifier
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"343"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNewWord2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
HashMap	TokenNameIdentifier
ruleRegistry	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ruleRegistry	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"n343"	TokenNameStringLiteral
,	TokenNameCOMMA
Num343PatternConverter	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
"%n343"	TokenNameStringLiteral
,	TokenNameCOMMA
ruleRegistry	TokenNameIdentifier
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"343"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBogusWord1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
"%, foobar"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"%, foobar"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBogusWord2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
"xyz %, foobar"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"xyz %, foobar"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBasic1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
"hello %-5level - %m%n"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"hello INFO  - msg 1"	TokenNameStringLiteral
+	TokenNamePLUS
Layout	TokenNameIdentifier
.	TokenNameDOT
LINE_SEP	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBasic2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
"%relative %-5level [%thread] %logger - %m%n"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
expectedRelativeTime	TokenNameIdentifier
=	TokenNameEQUAL
event	TokenNameIdentifier
.	TokenNameDOT
timeStamp	TokenNameIdentifier
-	TokenNameMINUS
LoggingEvent	TokenNameIdentifier
.	TokenNameDOT
getStartTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expectedRelativeTime	TokenNameIdentifier
+	TokenNamePLUS
" INFO  [main] "	TokenNameStringLiteral
+	TokenNamePLUS
logger	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" - msg 1"	TokenNameStringLiteral
+	TokenNamePLUS
Layout	TokenNameIdentifier
.	TokenNameDOT
LINE_SEP	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMultiOption	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
"%d{HH:mm:ss}{GMT} %d{HH:mm:ss} %c  - %m"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SimpleDateFormat	TokenNameIdentifier
dateFormat	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
"HH:mm:ss"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
localTime	TokenNameIdentifier
=	TokenNameEQUAL
dateFormat	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Date	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
.	TokenNameDOT
timeStamp	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dateFormat	TokenNameIdentifier
.	TokenNameDOT
setTimeZone	TokenNameIdentifier
(	TokenNameLPAREN
TimeZone	TokenNameIdentifier
.	TokenNameDOT
getTimeZone	TokenNameIdentifier
(	TokenNameLPAREN
"GMT"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
utcTime	TokenNameIdentifier
=	TokenNameEQUAL
dateFormat	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Date	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
.	TokenNameDOT
timeStamp	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
utcTime	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
' '	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
localTime	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" org.foobar  - msg 1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBogus	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
"%bogus"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"%bogus"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMore	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
"%more"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"msg 1ore"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMalformedOption	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
"foo%m{yyyy.MM.dd"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"foomsg 1{yyyy.MM.dd"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertFactories	TokenNameIdentifier
(	TokenNameLPAREN
Map	TokenNameIdentifier
rules	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
rules	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
rules	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
factorySig	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Class	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"[Ljava.lang.String;"	TokenNameStringLiteral
)	TokenNameRPAREN
}	TokenNameRBRACE
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
factoryArg	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
null	TokenNamenull
}	TokenNameRBRACE
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Class	TokenNameIdentifier
ruleClass	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Class	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Method	TokenNameIdentifier
factory	TokenNameIdentifier
=	TokenNameEQUAL
ruleClass	TokenNameIdentifier
.	TokenNameDOT
getMethod	TokenNameIdentifier
(	TokenNameLPAREN
"newInstance"	TokenNameStringLiteral
,	TokenNameCOMMA
factorySig	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
converter	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
factoryArg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
converter	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testPatternLayoutFactories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
assertFactories	TokenNameIdentifier
(	TokenNameLPAREN
PatternParser	TokenNameIdentifier
.	TokenNameDOT
getPatternLayoutRules	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFileNamePatternFactories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
assertFactories	TokenNameIdentifier
(	TokenNameLPAREN
PatternParser	TokenNameIdentifier
.	TokenNameDOT
getFileNamePatternRules	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
