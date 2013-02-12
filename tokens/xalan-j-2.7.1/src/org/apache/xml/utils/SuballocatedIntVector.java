package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SuballocatedIntVector	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
int	TokenNameint
m_blocksize	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
m_SHIFT	TokenNameIdentifier
,	TokenNameCOMMA
m_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
NUMBLOCKS_DEFAULT	TokenNameIdentifier
=	TokenNameEQUAL
32	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
m_numblocks	TokenNameIdentifier
=	TokenNameEQUAL
NUMBLOCKS_DEFAULT	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
m_firstFree	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
m_map0	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
m_buildCache	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
m_buildCacheStartIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SuballocatedIntVector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
2048	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SuballocatedIntVector	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
blocksize	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numblocks	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
m_SHIFT	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
0	TokenNameIntegerLiteral
!=	TokenNameNOT_EQUAL
(	TokenNameLPAREN
blocksize	TokenNameIdentifier
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
m_SHIFT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_blocksize	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
m_MASK	TokenNameIdentifier
=	TokenNameEQUAL
m_blocksize	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
m_numblocks	TokenNameIdentifier
=	TokenNameEQUAL
numblocks	TokenNameIdentifier
;	TokenNameSEMICOLON
m_map0	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
m_map	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
numblocks	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
m_map0	TokenNameIdentifier
;	TokenNameSEMICOLON
m_buildCache	TokenNameIdentifier
=	TokenNameEQUAL
m_map0	TokenNameIdentifier
;	TokenNameSEMICOLON
m_buildCacheStartIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SuballocatedIntVector	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
blocksize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
blocksize	TokenNameIdentifier
,	TokenNameCOMMA
NUMBLOCKS_DEFAULT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_firstFree	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSize	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
sz	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_firstFree	TokenNameIdentifier
>	TokenNameGREATER
sz	TokenNameIdentifier
)	TokenNameRPAREN
m_firstFree	TokenNameIdentifier
=	TokenNameEQUAL
sz	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addElement	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
indexRelativeToCache	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
-	TokenNameMINUS
m_buildCacheStartIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
indexRelativeToCache	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
indexRelativeToCache	TokenNameIdentifier
<	TokenNameLESS
m_blocksize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_buildCache	TokenNameIdentifier
[	TokenNameLBRACKET
indexRelativeToCache	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
m_firstFree	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
&	TokenNameAND
m_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_map	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
newsize	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
+	TokenNamePLUS
m_numblocks	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
newsize	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
m_map	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
newMap	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
m_map	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_map	TokenNameIdentifier
=	TokenNameEQUAL
newMap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
block	TokenNameIdentifier
)	TokenNameRPAREN
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
block	TokenNameIdentifier
[	TokenNameLBRACKET
offset	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
m_buildCache	TokenNameIdentifier
=	TokenNameEQUAL
block	TokenNameIdentifier
;	TokenNameSEMICOLON
m_buildCacheStartIndex	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
-	TokenNameMINUS
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
m_firstFree	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
addElements	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
value	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numberOfElements	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_firstFree	TokenNameIdentifier
+	TokenNamePLUS
numberOfElements	TokenNameIdentifier
<	TokenNameLESS
m_blocksize	TokenNameIdentifier
)	TokenNameRPAREN
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
numberOfElements	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
m_map0	TokenNameIdentifier
[	TokenNameLBRACKET
m_firstFree	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
&	TokenNameAND
m_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
m_firstFree	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
numberOfElements	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
numberOfElements	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_map	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
newsize	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
+	TokenNamePLUS
m_numblocks	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
newsize	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
m_map	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
newMap	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
m_map	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_map	TokenNameIdentifier
=	TokenNameEQUAL
newMap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
block	TokenNameIdentifier
)	TokenNameRPAREN
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
copied	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
m_blocksize	TokenNameIdentifier
-	TokenNameMINUS
offset	TokenNameIdentifier
<	TokenNameLESS
numberOfElements	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
m_blocksize	TokenNameIdentifier
-	TokenNameMINUS
offset	TokenNameIdentifier
:	TokenNameCOLON
numberOfElements	TokenNameIdentifier
;	TokenNameSEMICOLON
numberOfElements	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
copied	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
copied	TokenNameIdentifier
--	TokenNameMINUS_MINUS
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
block	TokenNameIdentifier
[	TokenNameLBRACKET
offset	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
index	TokenNameIdentifier
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
addElements	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
numberOfElements	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
newlen	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
+	TokenNamePLUS
numberOfElements	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
newlen	TokenNameIdentifier
>	TokenNameGREATER
m_blocksize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
newindex	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
m_firstFree	TokenNameIdentifier
+	TokenNamePLUS
numberOfElements	TokenNameIdentifier
)	TokenNameRPAREN
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
newindex	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
m_firstFree	TokenNameIdentifier
=	TokenNameEQUAL
newlen	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
insertElementAt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
value	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
at	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
at	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
m_firstFree	TokenNameIdentifier
)	TokenNameRPAREN
addElement	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
at	TokenNameIdentifier
>	TokenNameGREATER
m_firstFree	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_map	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
newsize	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
+	TokenNamePLUS
m_numblocks	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
newsize	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
m_map	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
newMap	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
m_map	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_map	TokenNameIdentifier
=	TokenNameEQUAL
newMap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
block	TokenNameIdentifier
)	TokenNameRPAREN
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
&	TokenNameAND
m_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
block	TokenNameIdentifier
[	TokenNameLBRACKET
offset	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
m_firstFree	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
maxindex	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
m_firstFree	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
&	TokenNameAND
m_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
push	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
index	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
maxindex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
copylen	TokenNameIdentifier
=	TokenNameEQUAL
m_blocksize	TokenNameIdentifier
-	TokenNameMINUS
offset	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
block	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
push	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
push	TokenNameIdentifier
=	TokenNameEQUAL
block	TokenNameIdentifier
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
block	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
block	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
copylen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
block	TokenNameIdentifier
[	TokenNameLBRACKET
offset	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
value	TokenNameIdentifier
=	TokenNameEQUAL
push	TokenNameIdentifier
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
index	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
removeAllElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
m_firstFree	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
m_buildCache	TokenNameIdentifier
=	TokenNameEQUAL
m_map0	TokenNameIdentifier
;	TokenNameSEMICOLON
m_buildCacheStartIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
removeElement	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
at	TokenNameIdentifier
=	TokenNameEQUAL
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
at	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
removeElementAt	TokenNameIdentifier
(	TokenNameLPAREN
at	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
removeElementAt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
at	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
at	TokenNameIdentifier
<	TokenNameLESS
m_firstFree	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
maxindex	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
&	TokenNameAND
m_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
index	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
maxindex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
copylen	TokenNameIdentifier
=	TokenNameEQUAL
m_blocksize	TokenNameIdentifier
-	TokenNameMINUS
offset	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
block	TokenNameIdentifier
)	TokenNameRPAREN
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
else	TokenNameelse
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
block	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
block	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
copylen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
<	TokenNameLESS
maxindex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
next	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
block	TokenNameIdentifier
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
next	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
:	TokenNameCOLON
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
block	TokenNameIdentifier
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
index	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
--	TokenNameMINUS_MINUS
m_firstFree	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setElementAt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
value	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
at	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
at	TokenNameIdentifier
<	TokenNameLESS
m_blocksize	TokenNameIdentifier
)	TokenNameRPAREN
m_map0	TokenNameIdentifier
[	TokenNameLBRACKET
at	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
&	TokenNameAND
m_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_map	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
newsize	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
+	TokenNamePLUS
m_numblocks	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
newsize	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
m_map	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
newMap	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
m_map	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_map	TokenNameIdentifier
=	TokenNameEQUAL
newMap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
block	TokenNameIdentifier
)	TokenNameRPAREN
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
m_blocksize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
block	TokenNameIdentifier
[	TokenNameLBRACKET
offset	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
at	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_firstFree	TokenNameIdentifier
)	TokenNameRPAREN
m_firstFree	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
m_blocksize	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
m_map0	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
return	TokenNamereturn
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
i	TokenNameIdentifier
&	TokenNameAND
m_MASK	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
contains	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
elem	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_firstFree	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
bindex	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
boffset	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
&	TokenNameAND
m_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
maxindex	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
block	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
bindex	TokenNameIdentifier
<	TokenNameLESS
maxindex	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
bindex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
bindex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
block	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
boffset	TokenNameIdentifier
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
<	TokenNameLESS
m_blocksize	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
offset	TokenNameIdentifier
)	TokenNameRPAREN
if	TokenNameif
(	TokenNameLPAREN
block	TokenNameIdentifier
[	TokenNameLBRACKET
offset	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
elem	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
offset	TokenNameIdentifier
+	TokenNamePLUS
bindex	TokenNameIdentifier
*	TokenNameMULTIPLY
m_blocksize	TokenNameIdentifier
;	TokenNameSEMICOLON
boffset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
maxoffset	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
&	TokenNameAND
m_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
maxindex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
boffset	TokenNameIdentifier
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
<	TokenNameLESS
maxoffset	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
offset	TokenNameIdentifier
)	TokenNameRPAREN
if	TokenNameif
(	TokenNameLPAREN
block	TokenNameIdentifier
[	TokenNameLBRACKET
offset	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
elem	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
offset	TokenNameIdentifier
+	TokenNamePLUS
maxindex	TokenNameIdentifier
*	TokenNameMULTIPLY
m_blocksize	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
elem	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
elem	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
elem	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
boffset	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
&	TokenNameAND
m_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
m_firstFree	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
m_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
--	TokenNameMINUS_MINUS
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
block	TokenNameIdentifier
=	TokenNameEQUAL
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
block	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
boffset	TokenNameIdentifier
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
--	TokenNameMINUS_MINUS
offset	TokenNameIdentifier
)	TokenNameRPAREN
if	TokenNameif
(	TokenNameLPAREN
block	TokenNameIdentifier
[	TokenNameLBRACKET
offset	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
elem	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
offset	TokenNameIdentifier
+	TokenNamePLUS
index	TokenNameIdentifier
*	TokenNameMULTIPLY
m_blocksize	TokenNameIdentifier
;	TokenNameSEMICOLON
boffset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getMap0	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_map0	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_map	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
