package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
tasks	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
Analyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
TokenStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
PerfRunData	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
feeds	TokenNameIdentifier
.	TokenNameDOT
DocMaker	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Fieldable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
NumericField	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ReadTokensTask	TokenNameIdentifier
extends	TokenNameextends
PerfTask	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
ReadTokensTask	TokenNameIdentifier
(	TokenNameLPAREN
PerfRunData	TokenNameIdentifier
runData	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
totalTokenCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Document	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocMaker	TokenNameIdentifier
docMaker	TokenNameIdentifier
=	TokenNameEQUAL
getRunData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDocMaker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
=	TokenNameEQUAL
docMaker	TokenNameIdentifier
.	TokenNameDOT
makeDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
String	TokenNameIdentifier
getLogMessage	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
recsCount	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"read "	TokenNameStringLiteral
+	TokenNamePLUS
recsCount	TokenNameIdentifier
+	TokenNamePLUS
" docs; "	TokenNameStringLiteral
+	TokenNamePLUS
totalTokenCount	TokenNameIdentifier
+	TokenNamePLUS
" tokens"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doc	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
doLogic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Fieldable	TokenNameIdentifier
>	TokenNameGREATER
fields	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
getFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
getRunData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
tokenCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
final	TokenNamefinal
Fieldable	TokenNameIdentifier
field	TokenNameIdentifier
:	TokenNameCOLON
fields	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
field	TokenNameIdentifier
.	TokenNameDOT
isTokenized	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
field	TokenNameIdentifier
instanceof	TokenNameinstanceof
NumericField	TokenNameIdentifier
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
final	TokenNamefinal
TokenStream	TokenNameIdentifier
stream	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
TokenStream	TokenNameIdentifier
streamValue	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
tokenStreamValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
streamValue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
stream	TokenNameIdentifier
=	TokenNameEQUAL
streamValue	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
final	TokenNamefinal
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
Reader	TokenNameIdentifier
readerValue	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
readerValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
readerValue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
reader	TokenNameIdentifier
=	TokenNameEQUAL
readerValue	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
String	TokenNameIdentifier
stringValue	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
stringValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
stringValue	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"field must have either TokenStream, String or Reader value"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stringReader	TokenNameIdentifier
.	TokenNameDOT
init	TokenNameIdentifier
(	TokenNameLPAREN
stringValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
=	TokenNameEQUAL
stringReader	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
stream	TokenNameIdentifier
=	TokenNameEQUAL
analyzer	TokenNameIdentifier
.	TokenNameDOT
reusableTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
stream	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
stream	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
tokenCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
totalTokenCount	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
tokenCount	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
tokenCount	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ReusableStringReader	TokenNameIdentifier
stringReader	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ReusableStringReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
class	TokenNameclass
ReusableStringReader	TokenNameIdentifier
extends	TokenNameextends
Reader	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
upto	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
left	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
;	TokenNameSEMICOLON
ReusableStringReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
s	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
;	TokenNameSEMICOLON
left	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
upto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
read	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
read	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
c	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
read	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
c	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
off	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
left	TokenNameIdentifier
>	TokenNameGREATER
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
getChars	TokenNameIdentifier
(	TokenNameLPAREN
upto	TokenNameIdentifier
,	TokenNameCOMMA
upto	TokenNameIdentifier
+	TokenNamePLUS
len	TokenNameIdentifier
,	TokenNameCOMMA
c	TokenNameIdentifier
,	TokenNameCOMMA
off	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
upto	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
left	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
left	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
getChars	TokenNameIdentifier
(	TokenNameLPAREN
upto	TokenNameIdentifier
,	TokenNameCOMMA
upto	TokenNameIdentifier
+	TokenNamePLUS
left	TokenNameIdentifier
,	TokenNameCOMMA
c	TokenNameIdentifier
,	TokenNameCOMMA
off	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
r	TokenNameIdentifier
=	TokenNameEQUAL
left	TokenNameIdentifier
;	TokenNameSEMICOLON
left	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
upto	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
