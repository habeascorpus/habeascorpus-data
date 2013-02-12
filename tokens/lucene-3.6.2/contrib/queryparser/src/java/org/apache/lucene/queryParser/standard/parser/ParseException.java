package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
standard	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
Message	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
MessageImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ParseException	TokenNameIdentifier
extends	TokenNameextends
QueryNodeParseException	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
ParseException	TokenNameIdentifier
(	TokenNameLPAREN
Token	TokenNameIdentifier
currentTokenVal	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectedTokenSequencesVal	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
tokenImageVal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
new	TokenNamenew
MessageImpl	TokenNameIdentifier
(	TokenNameLPAREN
QueryParserMessages	TokenNameIdentifier
.	TokenNameDOT
INVALID_SYNTAX	TokenNameIdentifier
,	TokenNameCOMMA
initialise	TokenNameIdentifier
(	TokenNameLPAREN
currentTokenVal	TokenNameIdentifier
,	TokenNameCOMMA
expectedTokenSequencesVal	TokenNameIdentifier
,	TokenNameCOMMA
tokenImageVal	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
currentToken	TokenNameIdentifier
=	TokenNameEQUAL
currentTokenVal	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
expectedTokenSequences	TokenNameIdentifier
=	TokenNameEQUAL
expectedTokenSequencesVal	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
tokenImage	TokenNameIdentifier
=	TokenNameEQUAL
tokenImageVal	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ParseException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
new	TokenNamenew
MessageImpl	TokenNameIdentifier
(	TokenNameLPAREN
QueryParserMessages	TokenNameIdentifier
.	TokenNameDOT
INVALID_SYNTAX	TokenNameIdentifier
,	TokenNameCOMMA
"Error"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ParseException	TokenNameIdentifier
(	TokenNameLPAREN
Message	TokenNameIdentifier
message	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
specialConstructor	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Token	TokenNameIdentifier
currentToken	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectedTokenSequences	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
tokenImage	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
initialise	TokenNameIdentifier
(	TokenNameLPAREN
Token	TokenNameIdentifier
currentToken	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectedTokenSequences	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
tokenImage	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
eol	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"line.separator"	TokenNameStringLiteral
,	TokenNameCOMMA
"n"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
expected	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
maxSize	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
expectedTokenSequences	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
maxSize	TokenNameIdentifier
<	TokenNameLESS
expectedTokenSequences	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
maxSize	TokenNameIdentifier
=	TokenNameEQUAL
expectedTokenSequences	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
expectedTokenSequences	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
expected	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
tokenImage	TokenNameIdentifier
[	TokenNameLBRACKET
expectedTokenSequences	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
' '	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
expectedTokenSequences	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
expectedTokenSequences	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
expected	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"..."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
expected	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
eol	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"    "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
retval	TokenNameIdentifier
=	TokenNameEQUAL
"Encountered ""	TokenNameStringLiteral
;	TokenNameSEMICOLON
Token	TokenNameIdentifier
tok	TokenNameIdentifier
=	TokenNameEQUAL
currentToken	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
maxSize	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" "	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tok	TokenNameIdentifier
.	TokenNameDOT
kind	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
tokenImage	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" "	TokenNameStringLiteral
+	TokenNamePLUS
tokenImage	TokenNameIdentifier
[	TokenNameLBRACKET
tok	TokenNameIdentifier
.	TokenNameDOT
kind	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" ""	TokenNameStringLiteral
;	TokenNameSEMICOLON
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
add_escapes	TokenNameIdentifier
(	TokenNameLPAREN
tok	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" ""	TokenNameStringLiteral
;	TokenNameSEMICOLON
tok	TokenNameIdentifier
=	TokenNameEQUAL
tok	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"" at line "	TokenNameStringLiteral
+	TokenNamePLUS
currentToken	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
.	TokenNameDOT
beginLine	TokenNameIdentifier
+	TokenNamePLUS
", column "	TokenNameStringLiteral
+	TokenNamePLUS
currentToken	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
.	TokenNameDOT
beginColumn	TokenNameIdentifier
;	TokenNameSEMICOLON
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"."	TokenNameStringLiteral
+	TokenNamePLUS
eol	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
expectedTokenSequences	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"Was expecting:"	TokenNameStringLiteral
+	TokenNamePLUS
eol	TokenNameIdentifier
+	TokenNamePLUS
"    "	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"Was expecting one of:"	TokenNameStringLiteral
+	TokenNamePLUS
eol	TokenNameIdentifier
+	TokenNamePLUS
"    "	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
retval	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
expected	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
retval	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
eol	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"line.separator"	TokenNameStringLiteral
,	TokenNameCOMMA
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
private	TokenNameprivate
String	TokenNameIdentifier
add_escapes	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
retval	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
char	TokenNamechar
ch	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
str	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
0	TokenNameIntegerLiteral
:	TokenNameCOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\b'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\b"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\t'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\t"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\n'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\n"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\f'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\f"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\r'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\r"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\"'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\''	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\'"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
case	TokenNamecase
'\\'	TokenNameCharacterLiteral
:	TokenNameCOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\\"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
ch	TokenNameIdentifier
=	TokenNameEQUAL
str	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
<	TokenNameLESS
0x20	TokenNameIntegerLiteral
||	TokenNameOR_OR
ch	TokenNameIdentifier
>	TokenNameGREATER
0x7e	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
"0000"	TokenNameStringLiteral
+	TokenNamePLUS
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"\u"	TokenNameStringLiteral
+	TokenNamePLUS
s	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
retval	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
retval	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
