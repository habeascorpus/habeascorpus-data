package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
performance	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
NewVsSetLen	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
String	TokenNameIdentifier
s	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
int	TokenNameint
BIGBUF_LEN	TokenNameIdentifier
=	TokenNameEQUAL
1048576	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
int	TokenNameint
SBUF_LEN	TokenNameIdentifier
=	TokenNameEQUAL
256	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
int	TokenNameint
RUN_LENGTH	TokenNameIdentifier
=	TokenNameEQUAL
BIGBUF_LEN	TokenNameIdentifier
/	TokenNameDIVIDE
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
sbuf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
SBUF_LEN	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
static	TokenNamestatic
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bigbuf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
BIGBUF_LEN	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
SBUF_LEN	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
sbuf	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
BIGBUF_LEN	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
bigbuf	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
public	TokenNamepublic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
t	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
SBUF_LEN	TokenNameIdentifier
;	TokenNameSEMICOLON
len	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
BIGBUF_LEN	TokenNameIdentifier
;	TokenNameSEMICOLON
len	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
RUN_LENGTH	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"<td>"	TokenNameStringLiteral
+	TokenNamePLUS
len	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
second	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
second	TokenNameIdentifier
<	TokenNameLESS
16	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"SECOND loop="	TokenNameStringLiteral
+	TokenNamePLUS
second	TokenNameIdentifier
+	TokenNamePLUS
", RUN_LENGTH="	TokenNameStringLiteral
+	TokenNamePLUS
RUN_LENGTH	TokenNameIdentifier
+	TokenNamePLUS
", len="	TokenNameStringLiteral
+	TokenNamePLUS
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
t	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
newBuffer	TokenNameIdentifier
(	TokenNameLPAREN
len	TokenNameIdentifier
,	TokenNameCOMMA
second	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
"<td>"	TokenNameStringLiteral
+	TokenNamePLUS
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
t	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
setLen	TokenNameIdentifier
(	TokenNameLPAREN
len	TokenNameIdentifier
,	TokenNameCOMMA
second	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
" <td>"	TokenNameStringLiteral
+	TokenNamePLUS
t	TokenNameIdentifier
+	TokenNamePLUS
"  "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
second	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
second	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
second	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
double	TokenNamedouble
newBuffer	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
size	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
second	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
before	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
RUN_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
SBUF_LEN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
sbuf	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
sbuf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
bigbuf	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
x	TokenNameIdentifier
<	TokenNameLESS
second	TokenNameIdentifier
;	TokenNameSEMICOLON
x	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
SBUF_LEN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
sbuf	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
SBUF_LEN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
before	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
1000.0	TokenNameDoubleLiteral
/	TokenNameDIVIDE
RUN_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
double	TokenNamedouble
setLen	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
size	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
second	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
before	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
SBUF_LEN	TokenNameIdentifier
)	TokenNameRPAREN
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
RUN_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
sbuf	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
sbuf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
bigbuf	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
x	TokenNameIdentifier
<	TokenNameLESS
second	TokenNameIdentifier
;	TokenNameSEMICOLON
x	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
sbuf	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
SBUF_LEN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
before	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
1000.0	TokenNameDoubleLiteral
/	TokenNameDIVIDE
RUN_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE