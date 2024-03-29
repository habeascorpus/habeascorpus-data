package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
ServerSocket	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
Socket	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
OutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LockVerifyServer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
getTime	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
startTime	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"["	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
startTime	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
"s] "	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
" Usage: java org.apache.lucene.store.LockVerifyServer port "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
exit	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
port	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
args	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ServerSocket	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ServerSocket	TokenNameIdentifier
(	TokenNameLPAREN
port	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setReuseAddress	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
" Ready on port "	TokenNameStringLiteral
+	TokenNamePLUS
port	TokenNameIdentifier
+	TokenNamePLUS
"..."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
lockedID	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
long	TokenNamelong
startTime	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
Socket	TokenNameIdentifier
cs	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
accept	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
OutputStream	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
cs	TokenNameIdentifier
.	TokenNameDOT
getOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
cs	TokenNameIdentifier
.	TokenNameDOT
getInputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
id	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
command	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
err	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
command	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
lockedID	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
err	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
getTime	TokenNameIdentifier
(	TokenNameLPAREN
startTime	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" ERROR: id "	TokenNameStringLiteral
+	TokenNamePLUS
id	TokenNameIdentifier
+	TokenNamePLUS
" got lock, but "	TokenNameStringLiteral
+	TokenNamePLUS
lockedID	TokenNameIdentifier
+	TokenNamePLUS
" already holds the lock"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
lockedID	TokenNameIdentifier
=	TokenNameEQUAL
id	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
command	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
lockedID	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
id	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
err	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
getTime	TokenNameIdentifier
(	TokenNameLPAREN
startTime	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" ERROR: id "	TokenNameStringLiteral
+	TokenNamePLUS
id	TokenNameIdentifier
+	TokenNamePLUS
" released the lock, but "	TokenNameStringLiteral
+	TokenNamePLUS
lockedID	TokenNameIdentifier
+	TokenNamePLUS
" is the one holding the lock"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
lockedID	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"unrecognized command "	TokenNameStringLiteral
+	TokenNamePLUS
command	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
err	TokenNameIdentifier
)	TokenNameRPAREN
out	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
out	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cs	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
