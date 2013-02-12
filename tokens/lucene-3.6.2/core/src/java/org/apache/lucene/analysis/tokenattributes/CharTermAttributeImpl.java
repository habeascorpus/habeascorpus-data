package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
tokenattributes	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
CharBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
AttributeImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
AttributeReflector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
RamUsageEstimator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CharTermAttributeImpl	TokenNameIdentifier
extends	TokenNameextends
AttributeImpl	TokenNameIdentifier
implements	TokenNameimplements
CharTermAttribute	TokenNameIdentifier
,	TokenNameCOMMA
TermAttribute	TokenNameIdentifier
,	TokenNameCOMMA
Cloneable	TokenNameIdentifier
,	TokenNameCOMMA
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
MIN_BUFFER_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
termBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
ArrayUtil	TokenNameIdentifier
.	TokenNameDOT
oversize	TokenNameIdentifier
(	TokenNameLPAREN
MIN_BUFFER_SIZE	TokenNameIdentifier
,	TokenNameCOMMA
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_CHAR	TokenNameIdentifier
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
termLength	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
copyBuffer	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
growTermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termLength	TokenNameIdentifier
=	TokenNameEQUAL
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setTermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
copyBuffer	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setTermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
buffer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
growTermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
getChars	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
length	TokenNameIdentifier
,	TokenNameCOMMA
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termLength	TokenNameIdentifier
=	TokenNameEQUAL
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setTermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
buffer	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
offset	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
offset	TokenNameIdentifier
+	TokenNamePLUS
length	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
growTermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
getChars	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
+	TokenNamePLUS
length	TokenNameIdentifier
,	TokenNameCOMMA
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termLength	TokenNameIdentifier
=	TokenNameEQUAL
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
termBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
resizeBuffer	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
newSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
<	TokenNameLESS
newSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newCharBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
ArrayUtil	TokenNameIdentifier
.	TokenNameDOT
oversize	TokenNameIdentifier
(	TokenNameLPAREN
newSize	TokenNameIdentifier
,	TokenNameCOMMA
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_CHAR	TokenNameIdentifier
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
newCharBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
termBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termBuffer	TokenNameIdentifier
=	TokenNameEQUAL
newCharBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
termBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
resizeTermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
newSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
resizeBuffer	TokenNameIdentifier
(	TokenNameLPAREN
newSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
growTermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
newSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
<	TokenNameLESS
newSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
termBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
ArrayUtil	TokenNameIdentifier
.	TokenNameDOT
oversize	TokenNameIdentifier
(	TokenNameLPAREN
newSize	TokenNameIdentifier
,	TokenNameCOMMA
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_CHAR	TokenNameIdentifier
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
termLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termLength	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CharTermAttribute	TokenNameIdentifier
setLength	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
length	TokenNameIdentifier
>	TokenNameGREATER
termBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"length "	TokenNameStringLiteral
+	TokenNamePLUS
length	TokenNameIdentifier
+	TokenNamePLUS
" exceeds the size of the termBuffer ("	TokenNameStringLiteral
+	TokenNamePLUS
termBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termLength	TokenNameIdentifier
=	TokenNameEQUAL
length	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CharTermAttribute	TokenNameIdentifier
setEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
termLength	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setTermLength	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setLength	TokenNameIdentifier
(	TokenNameLPAREN
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termLength	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
char	TokenNamechar
charAt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
termLength	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IndexOutOfBoundsException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
termBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CharSequence	TokenNameIdentifier
subSequence	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
start	TokenNameIdentifier
>	TokenNameGREATER
termLength	TokenNameIdentifier
||	TokenNameOR_OR
end	TokenNameIdentifier
>	TokenNameGREATER
termLength	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IndexOutOfBoundsException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CharTermAttribute	TokenNameIdentifier
append	TokenNameIdentifier
(	TokenNameLPAREN
CharSequence	TokenNameIdentifier
csq	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
csq	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
appendNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
append	TokenNameIdentifier
(	TokenNameLPAREN
csq	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
csq	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CharTermAttribute	TokenNameIdentifier
append	TokenNameIdentifier
(	TokenNameLPAREN
CharSequence	TokenNameIdentifier
csq	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
csq	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
csq	TokenNameIdentifier
=	TokenNameEQUAL
"null"	TokenNameStringLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
end	TokenNameIdentifier
-	TokenNameMINUS
start	TokenNameIdentifier
,	TokenNameCOMMA
csqlen	TokenNameIdentifier
=	TokenNameEQUAL
csq	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
start	TokenNameIdentifier
>	TokenNameGREATER
csqlen	TokenNameIdentifier
||	TokenNameOR_OR
end	TokenNameIdentifier
>	TokenNameGREATER
csqlen	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IndexOutOfBoundsException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
resizeBuffer	TokenNameIdentifier
(	TokenNameLPAREN
termLength	TokenNameIdentifier
+	TokenNamePLUS
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
csq	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
csq	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getChars	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
,	TokenNameCOMMA
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
csq	TokenNameIdentifier
instanceof	TokenNameinstanceof
StringBuilder	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
(	TokenNameLPAREN
(	TokenNameLPAREN
StringBuilder	TokenNameIdentifier
)	TokenNameRPAREN
csq	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getChars	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
,	TokenNameCOMMA
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
csq	TokenNameIdentifier
instanceof	TokenNameinstanceof
CharTermAttribute	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
)	TokenNameRPAREN
csq	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
termLength	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
csq	TokenNameIdentifier
instanceof	TokenNameinstanceof
CharBuffer	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
(	TokenNameLPAREN
CharBuffer	TokenNameIdentifier
)	TokenNameRPAREN
csq	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
hasArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
CharBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CharBuffer	TokenNameIdentifier
)	TokenNameRPAREN
csq	TokenNameIdentifier
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
.	TokenNameDOT
array	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
cb	TokenNameIdentifier
.	TokenNameDOT
arrayOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
cb	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
start	TokenNameIdentifier
,	TokenNameCOMMA
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
termLength	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
csq	TokenNameIdentifier
instanceof	TokenNameinstanceof
StringBuffer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
(	TokenNameLPAREN
(	TokenNameLPAREN
StringBuffer	TokenNameIdentifier
)	TokenNameRPAREN
csq	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getChars	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
,	TokenNameCOMMA
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
start	TokenNameIdentifier
<	TokenNameLESS
end	TokenNameIdentifier
)	TokenNameRPAREN
termBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
termLength	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
csq	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
termLength	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
start	TokenNameIdentifier
<	TokenNameLESS
end	TokenNameIdentifier
)	TokenNameRPAREN
termBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
termLength	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
csq	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CharTermAttribute	TokenNameIdentifier
append	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
resizeBuffer	TokenNameIdentifier
(	TokenNameLPAREN
termLength	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
[	TokenNameLBRACKET
termLength	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
c	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CharTermAttribute	TokenNameIdentifier
append	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
appendNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
getChars	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
resizeBuffer	TokenNameIdentifier
(	TokenNameLPAREN
termLength	TokenNameIdentifier
+	TokenNamePLUS
len	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termLength	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CharTermAttribute	TokenNameIdentifier
append	TokenNameIdentifier
(	TokenNameLPAREN
StringBuilder	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
appendNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
getChars	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
resizeBuffer	TokenNameIdentifier
(	TokenNameLPAREN
termLength	TokenNameIdentifier
+	TokenNamePLUS
len	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termLength	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CharTermAttribute	TokenNameIdentifier
append	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
ta	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ta	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
appendNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
ta	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
ta	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
resizeBuffer	TokenNameIdentifier
(	TokenNameLPAREN
termLength	TokenNameIdentifier
+	TokenNamePLUS
len	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
termLength	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termLength	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
CharTermAttribute	TokenNameIdentifier
appendNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
resizeBuffer	TokenNameIdentifier
(	TokenNameLPAREN
termLength	TokenNameIdentifier
+	TokenNamePLUS
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
termLength	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
'n'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
termBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
termLength	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
'u'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
termBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
termLength	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
'l'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
termBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
termLength	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
'l'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
code	TokenNameIdentifier
=	TokenNameEQUAL
termLength	TokenNameIdentifier
;	TokenNameSEMICOLON
code	TokenNameIdentifier
=	TokenNameEQUAL
code	TokenNameIdentifier
*	TokenNameMULTIPLY
31	TokenNameIntegerLiteral
+	TokenNamePLUS
ArrayUtil	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
code	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
termLength	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Object	TokenNameIdentifier
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
CharTermAttributeImpl	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CharTermAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
super	TokenNamesuper
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
termBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
this	TokenNamethis
.	TokenNameDOT
termLength	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
t	TokenNameIdentifier
.	TokenNameDOT
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
t	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
other	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
this	TokenNamethis
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
other	TokenNameIdentifier
instanceof	TokenNameinstanceof
CharTermAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
CharTermAttributeImpl	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
CharTermAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
other	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
termLength	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
o	TokenNameIdentifier
.	TokenNameDOT
termLength	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
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
termLength	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
o	TokenNameIdentifier
.	TokenNameDOT
termBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
reflectWith	TokenNameIdentifier
(	TokenNameLPAREN
AttributeReflector	TokenNameIdentifier
reflector	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reflector	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
"term"	TokenNameStringLiteral
,	TokenNameCOMMA
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
copyTo	TokenNameIdentifier
(	TokenNameLPAREN
AttributeImpl	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
target	TokenNameIdentifier
instanceof	TokenNameinstanceof
CharTermAttribute	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CharTermAttribute	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
)	TokenNameRPAREN
target	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
copyBuffer	TokenNameIdentifier
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
TermAttribute	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TermAttribute	TokenNameIdentifier
)	TokenNameRPAREN
target	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
setTermBuffer	TokenNameIdentifier
(	TokenNameLPAREN
termBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
